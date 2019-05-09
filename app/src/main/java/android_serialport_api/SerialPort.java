package android_serialport_api;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SerialPort {

    private static final String TAG = "SerialPort";
    private FileDescriptor mFd;
    private FileInputStream mFileInputStream;
    private FileOutputStream mFileOutputStream;

    public  SerialPort(File device, int baudrate, int dataBits, int stopBits, char parity, Context context) {
       try {
           Log.i("test","zxczcz 现在才 ");

           //检查访问权限，如果没有读写权限，进行文件操作，修改文件访问权限
           if (!device.canRead() || !device.canWrite()) {
               try {
                   //通过挂载到linux的方式，修改文件的操作权限
                   Process su = Runtime.getRuntime().exec("/system/xbin/su");
                   String cmd = "chmod 777 " + device.getAbsolutePath() + "\n" + "exit\n";
                   su.getOutputStream().write(cmd.getBytes());

                   if ((su.waitFor() != 0) || !device.canRead() || !device.canWrite()) {

                       throw new SecurityException();
                   }
               } catch (Exception e) {
                   e.printStackTrace();
                   throw new SecurityException();
               }
           }




           if(device.canRead() ){
               Log.e("logzz","可以读");
               if(device.canWrite()){
                   Log.e("logzz","可以写");
               }
           }
         //  mFd = open(device.getAbsolutePath(), baudrate, dataBits,stopBits,parity);
           mFd = open(device.getAbsolutePath(), baudrate,0);
           if (mFd == null) {
               Log.e(TAG, "native open returns null");
               throw new IOException();
           }

           mFileInputStream = new FileInputStream(mFd);
           mFileOutputStream = new FileOutputStream(mFd);
       }catch (Exception e){
           Log.i("test","喆幸福的事现在才 ");
       }

    }

    // Getters and setters
    public InputStream getInputStream() {
        return mFileInputStream;
    }

    public OutputStream getOutputStream() {
        return mFileOutputStream;
    }

    // JNI(调用java本地接口，实现串口的打开和关闭)
/**串口有五个重要的参数：串口设备名，波特率，检验位，数据位，停止位
 其中检验位一般默认位NONE,数据位一般默认为8，停止位默认为1*/
    /**
     * @param path 串口设备的据对路径
     * @param baudrate 波特率
     * @param dataBits 数据位
     * @param stopBits 停止位
     * @param parity 校验位
     */
    private native static FileDescriptor open(String path, int baudrate, int dataBits,int stopBits,char parity);
    public native void close();
    // JNI
    private native static FileDescriptor open(String path, int baudrate, int flags);
    static {//加载jni下的C文件库
        System.loadLibrary("serial_port");
    }
}

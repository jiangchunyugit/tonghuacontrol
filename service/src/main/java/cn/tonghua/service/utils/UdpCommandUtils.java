package cn.tonghua.service.utils;

import cn.tonghua.database.model.ProjectManager;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.*;

public class UdpCommandUtils {

    public static void sendCommand(ProjectManager projectManager) {

        // 判断ip，端口号，命令是否是空
        if (StringUtils.isNotBlank(projectManager.getCommand()) && StringUtils.isNotBlank(projectManager.getIp()) && StringUtils.isNotBlank(projectManager.getPort())) {
            String command = projectManager.getCommand();
            String ip = projectManager.getIp();
            int port = Integer.valueOf(projectManager.getPort());

            DatagramSocket ds = null;

            //指定自己的port
            try {
                ds = new DatagramSocket(Integer.valueOf(port));
            } catch (SocketException e) {
                System.out.println(e.getMessage());
            }

            byte[] buf = null;
            // 判断命令是否16进制字符串
            if (1 == projectManager.getCommandType()) {
                // 获取16进制字节流
                buf = CommonGroupUtils.hexToBinary(command);
            } else {
                {
                    buf = command.getBytes();
                }
                InetAddress address = null;
                try {
                    address = InetAddress.getByName(ip);
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                DatagramPacket packet = new DatagramPacket(buf, buf.length, address, port);
                //发送数据
                try {
                    ds.send(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //关闭socket
                ds.close();
            }
        }
    }
}

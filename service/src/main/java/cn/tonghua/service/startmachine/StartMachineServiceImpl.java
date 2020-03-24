package cn.tonghua.service.startmachine;

import cn.tonghua.core.base.AbsBaseService;
import cn.tonghua.core.bundle.MyRespBundle;
import cn.tonghua.database.mapper.EquipmentMapper;
import cn.tonghua.database.model.Equipment;
import cn.tonghua.database.model.EquipmentExample;
import cn.tonghua.database.model.ProjectManager;
import cn.tonghua.database.utils.FileResourceEnabled;
import cn.tonghua.database.utils.ServiceType;
import cn.tonghua.service.utils.CommonGroupUtils;
import cn.tonghua.service.utils.StartUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.List;

@Service
public class StartMachineServiceImpl extends AbsBaseService implements StartMachineService {

//    @Autowired
//    EquipmentMapper equipmentMapper;
//
//    @Override
//    public MyRespBundle startMachine(String servieceNm) {
//
//        EquipmentExample equipmentExample = new EquipmentExample();
//        // 判断是否存在
//        if (isExit(servieceNm, equipmentExample)) {
//
//            List<Equipment> equipments = equipmentMapper.selectByExample(equipmentExample);
//            if (equipments != null && equipments.size() > 0) {
//                Equipment equipment = equipments.get(0);
//                String ip =equipment.getIp();
//                String mask = equipment.getMask();
//
//                try {
//                StartUtil.startMachine(ip,mask);
//                equipment.setIsEnable(FileResourceEnabled.ONE_true.code);
//                equipmentMapper.updateByExampleSelective(equipment,equipmentExample);
//                return sendSuccessMessage("操作成功");
//                } catch (UnknownHostException e) {
//                    //Ip地址错误时候抛出的异常
//                    return sendFailMessage("Ip地址错误");
//                } catch (IOException e) {
//                    //获取socket失败时候抛出的异常
//                    return sendFailMessage("操作失败");
//                }
//            }
//        }
//        return sendFailMessage("操作失败");
//    }
//
//    @Override
//    public MyRespBundle startMachine() {
//        EquipmentExample equipmentExample = new EquipmentExample();
//        EquipmentExample.Criteria criteria = equipmentExample.createCriteria();
//        criteria.andTypeEqualTo(ServiceType.Machie.code);
//
//        List<Equipment> equipments = equipmentMapper.selectByExample(equipmentExample);
//
//        if (equipments != null && equipments.size() > 0) {
//            for (Equipment equipment:equipments) {
//
//                String ip =equipment.getIp();
//                String mask = equipment.getMask();
//                try {
//                    StartUtil.startMachine(ip,mask);
//                    equipment.setIsEnable(FileResourceEnabled.ONE_true.code);
//                    equipmentMapper.updateByExampleSelective(equipment,equipmentExample);
//                } catch (UnknownHostException e) {
//                    //Ip地址错误时候抛出的异常
//                    return sendFailMessage(equipment.getServiceName()+"Ip地址错误");
//                } catch (IOException e) {
//                    //获取socket失败时候抛出的异常
//                    return sendFailMessage("操作失败");
//                }
//            }
//            return sendSuccessMessage("操作成功");
//        }
//        return sendFailMessage("操作失败");
//    }
//
//    private boolean isExit(String serviceNm, EquipmentExample equipmentExample) {
//        EquipmentExample.Criteria criteria = equipmentExample.createCriteria();
//        criteria.andServiceNameEqualTo(serviceNm);
//        criteria.andTypeEqualTo(ServiceType.Machie.code);
//        return equipmentMapper.countByExample(equipmentExample)>0?true:false;
//    }

    @Override
    public boolean startProject(ProjectManager projectManager) {

        //广播IP地址
        String ip = projectManager.getIp();
        //端口号
        int port = Integer.valueOf(projectManager.getPort());
        //魔术包数据
        String magicPacage = "0xFFFFFFFFFFFF" +
                projectManager.getMac()+ projectManager.getMac() + projectManager.getMac() + projectManager.getMac() +
                projectManager.getMac() + projectManager.getMac() + projectManager.getMac() + projectManager.getMac() +
                projectManager.getMac() + projectManager.getMac() + projectManager.getMac() + projectManager.getMac() +
                projectManager.getMac() + projectManager.getMac() + projectManager.getMac() + projectManager.getMac();
        //转换为2进制的魔术包数据
//        byte[] command = CommonGroupUtils.hexToBinary(magicPacage);

        //广播魔术包
        try {
            //1.获取ip地址
            InetAddress address = InetAddress.getByName(ip);
            //2.获取广播socket
            MulticastSocket socket = new MulticastSocket(port);
            //3.封装数据包
            /*public DatagramPacket(byte[] buf,int length
             *      ,InetAddress address
             *      ,int port)
             * buf：缓存的命令
             * length：每次发送的数据字节数，该值必须小于等于buf的大小
             * address：广播地址
             * port：广播端口
             */
//            DatagramPacket packet = new DatagramPacket(command, command.length, address, port);
            //4.发送数据
//            socket.send(packet);
            //5.关闭socket
            socket.close();
        } catch (UnknownHostException e) {
            //Ip地址错误时候抛出的异常
            e.printStackTrace();
        } catch (IOException e) {
            //获取socket失败时候抛出的异常
            e.printStackTrace();
        }
        return false;
    }
}

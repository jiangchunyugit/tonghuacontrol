//package cn.tonghua.service.BusinessStrategy;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//public class PriceFactory {
//
//    /**
//     * 要扫描的策略类的包
//     */
//    public static final String SCAN_PACKAGE = PriceFactory.class.getPackage().getName();
//
//    /**
//     * 策略类的集合
//     */
//    private List<Class<? extends CallPrice>> callPriceList = new ArrayList<>();
//
//    public PriceFactory() {
//        try {
//            getCallPriceList();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 获得对应金额的策略类
//     * @param price
//     * @return
//     * @throws Exception
//     */
//    public CallPrice getCallPrice(double price) throws Exception {
//
//        for (Class<? extends CallPrice> clazz : callPriceList) {
//            PriceRegion priceRegion = clazz.getAnnotation(PriceRegion.class);
//            if (priceRegion.max() ==price ) {
//                return clazz.newInstance();
//            }
//        }
//
//        return null;
//    }
//
//    /**
//     * 扫描策略类，添加到集合
//     * @return
//     * @throws ClassNotFoundException
//     */
//    public List<Class<? extends CallPrice>> getCallPriceList() throws ClassNotFoundException {
//
//        String path = "D:\\project_materials\\tonghuacontrol_github_qingdao\\service\\src\\main\\java\\cn\\tonghua\\service\\businessstrategy\\";
//        File file = new File(path);
//
//        String[] strs = file.list();
//
//        for (String str : strs) {
//
//            String forName = SCAN_PACKAGE+"."+str.replace(".java", "");
//
//            Class<? extends CallPrice> clazz = (Class<? extends CallPrice>) Class.forName(forName);
//            if (clazz.isAnnotationPresent(PriceRegion.class)) {
//                callPriceList.add(clazz);
//            }
//        }
//
//        return null;
//    }
//
//    /**
//     * 获得工厂实例
//     * @return
//     */
//    public static PriceFactory getInstance() {
//        return new PriceFactory();
//    }
//}

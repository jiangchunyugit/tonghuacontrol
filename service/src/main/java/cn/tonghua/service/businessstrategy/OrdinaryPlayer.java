//package cn.tonghua.service.BusinessStrategy;
//
//import cn.tonghua.database.event.NoticeInfoEvent;
//import cn.tonghua.service.event.EventService;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * 普通顾客 原价
// */
//@PriceRegion(max = 10000)
//public class OrdinaryPlayer implements CallPrice {
//
//    @Autowired
//    EventService eventService;
//
//    @Override
//    public double callPrice(double price) {
//
//        eventService.publish(new NoticeInfoEvent(""));
//        return price;
//    }
//}
//

package cn.tonghua.service.businessstrategy;

import java.util.HashMap;
import java.util.Map;

/**
 *@date 2020/03/23
 * @author jiangchunyu
 * 定时任务
 */
public class QuartzJobStrategyFactory {

    private Map<String, Object> map = new HashMap<>();

    public QuartzJobStrategyFactory() {

        // 看这里 看这里 看这里！
//        map.put("123",new OrderTimeOutJob());
//        map.put("234",new TestOrderTimeOutJob());

        /* 等同上面
        map = new HashMap<>();
        for (Strategy strategy : strategies) {
            map.put(strategy.getType(), strategy);
        }*/
    }

    public static class Holder {
        public static QuartzJobStrategyFactory instance = new QuartzJobStrategyFactory();
    }

    public static QuartzJobStrategyFactory getInstance() {
        return Holder.instance;
    }

    public Object get(String type) {
        return map.get(type);
    }
}

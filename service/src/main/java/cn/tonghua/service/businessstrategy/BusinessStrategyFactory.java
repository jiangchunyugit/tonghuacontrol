package cn.tonghua.service.businessstrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BusinessStrategyFactory {

    private Map<Integer, BusinessStrategyService> map;

    public BusinessStrategyFactory() {

        List<BusinessStrategyService> strategies = new ArrayList<>();

//        strategies.add(new SeaWordStrategyServiceImpl());
        strategies.add(new SmileStrategyServiceImpl());
        strategies.add(new TitleTouristStrategyServiceImpl());
//        strategies.add(new WisdomWaterfallStrategyServiceImpl());
        strategies.add(new NoticeServiceImpl());
        strategies.add(new HhshcomminfoStrategyServiceImpl());
        strategies.add(new HhshcomminfoProductStrategyServiceImpl());
        strategies.add(new ConductInfoServiceImpl());
        strategies.add(new BondInfoServiceImpl());
        strategies.add(new BondpropertyInfoServiceImpl());
        strategies.add(new ProducticonInfoServiceImpl());
        strategies.add(new JrproductInfoServiceImpl());
        strategies.add(new InsuranceInfoServiceImpl());
        strategies.add(new TitleAssessmentStrategyServiceImpl());
        strategies.add(new TitleCompetitiveStrategyServiceImpl());
        strategies.add(new SmileBackGroundStrategyServiceImpl());
        strategies.add(new MerchantServiceImpl());
        strategies.add(new FundInfoServiceImpl());
        strategies.add(new MerchantDoubleScreenServiceImpl());
        strategies.add(new MetalDoubleScreenServiceImpl());


        // 看这里 看这里 看这里！
        map = strategies.stream().collect(Collectors.toMap(BusinessStrategyService::getType, strategy -> strategy));

        /* 等同上面
        map = new HashMap<>();
        for (Strategy strategy : strategies) {
            map.put(strategy.getType(), strategy);
        }*/
    }

    public static class Holder {
        public static BusinessStrategyFactory instance = new BusinessStrategyFactory();
    }

    public static BusinessStrategyFactory getInstance() {
        return Holder.instance;
    }

    public BusinessStrategyService get(Integer type) {
        return map.get(type);
    }
}

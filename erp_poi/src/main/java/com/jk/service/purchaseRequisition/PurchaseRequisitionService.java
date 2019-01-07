package com.jk.service.purchaseRequisition;

import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.good.GoodBean;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;
import com.jk.utils.ResultPage;

public interface PurchaseRequisitionService {
    ResultPage queryPurchaseRequisitionPage(PurchaseRequisitionBean purchaseRequisitionBean);

    ResultPage queryGoodPage(CommodityTableBean commodityTableBean);

    ResultPage queryGoodListByIds(String ids);

    void savePurchaseRequisition(PurchaseRequisitionBean purchaseRequisitionBean, String str);

    PurchaseRequisitionBean queryPurchaseRequisitionInfoByPurchaseRequisitionIdentifier(PurchaseRequisitionBean purchaseRequisitionBean);

    void updatePurchaseRequisitionStatusById(PurchaseRequisitionBean purchaseRequisitionBean);
}

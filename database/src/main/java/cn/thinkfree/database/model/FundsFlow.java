package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table funds_flow
 */
public class FundsFlow extends BaseModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   订单编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.order_id
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * Database Column Remarks:
     *   支付金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.actual_amount
     *
     * @mbg.generated
     */
    private String actualAmount;

    /**
     * Database Column Remarks:
     *   流水类型 PC、WAP、POS、ALI、FAKE
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.flow_type
     *
     * @mbg.generated
     */
    private String flowType;

    /**
     * Database Column Remarks:
     *   现金、刷卡、  app、 线上确认汇款 线上确认支付
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.flow_sub_type
     *
     * @mbg.generated
     */
    private String flowSubType;

    /**
     * Database Column Remarks:
     *   100开始支付 200支付成功 201部分支付成功 202补流水 300流水作废 400对账单入账金额与本平台入账金额不一致 500退款开始状态 600退款成功状态 700退款失效状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.flow_status
     *
     * @mbg.generated
     */
    private String flowStatus;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.update_time
     *
     * @mbg.generated
     */
    private String updateTime;

    /**
     * Database Column Remarks:
     *   网关wap支付：订单发送支付时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.flow_txntime
     *
     * @mbg.generated
     */
    private String flowTxntime;

    /**
     * Database Column Remarks:
     *   银行交易时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.trace_time
     *
     * @mbg.generated
     */
    private String traceTime;

    /**
     * Database Column Remarks:
     *   银行系统参考号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.bank_trace
     *
     * @mbg.generated
     */
    private String bankTrace;

    /**
     * Database Column Remarks:
     *   POS 机的流水号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.pos_trace
     *
     * @mbg.generated
     */
    private String posTrace;

    /**
     * Database Column Remarks:
     *   银行卡号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.card_id
     *
     * @mbg.generated
     */
    private String cardId;

    /**
     * Database Column Remarks:
     *   卡类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.card_type
     *
     * @mbg.generated
     */
    private String cardType;

    /**
     * Database Column Remarks:
     *   发卡行机构代码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.issue_bankcode
     *
     * @mbg.generated
     */
    private String issueBankcode;

    /**
     * Database Column Remarks:
     *   备注字段
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.memo
     *
     * @mbg.generated
     */
    private String memo;

    /**
     * Database Column Remarks:
     *   0初始状态；200对账成功；100银联有入账，平台无入账；300银联无入账，平台有入账；400银联和平台入账金额对不上
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.bill_status
     *
     * @mbg.generated
     */
    private String billStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.trade_no
     *
     * @mbg.generated
     */
    private String tradeNo;

    /**
     * Database Column Remarks:
     *   查询id 银联线上必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.query_id
     *
     * @mbg.generated
     */
    private String queryId;

    /**
     * Database Column Remarks:
     *   原流水id，退款时必填
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.old_flowid
     *
     * @mbg.generated
     */
    private Long oldFlowid;

    /**
     * Database Column Remarks:
     *   退款银行卡号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.refund_bankname
     *
     * @mbg.generated
     */
    private String refundBankname;

    /**
     * Database Column Remarks:
     *   退款卡号后四位
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.refund_cardno
     *
     * @mbg.generated
     */
    private String refundCardno;

    /**
     * Database Column Remarks:
     *   退款交易号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.refund_trace
     *
     * @mbg.generated
     */
    private String refundTrace;

    /**
     * Database Column Remarks:
     *   商户号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.biz_num
     *
     * @mbg.generated
     */
    private String bizNum;

    /**
     * Database Column Remarks:
     *   终端号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.terminal_num
     *
     * @mbg.generated
     */
    private String terminalNum;

    /**
     * Database Column Remarks:
     *   交易类型：消费、退货
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.trace_type
     *
     * @mbg.generated
     */
    private String traceType;

    /**
     * Database Column Remarks:
     *   账单文件名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.bill_file_name
     *
     * @mbg.generated
     */
    private String billFileName;

    /**
     * Database Column Remarks:
     *   对账单中：交易金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.bill_trace_amount
     *
     * @mbg.generated
     */
    private String billTraceAmount;

    /**
     * Database Column Remarks:
     *   对账单中：手续费
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.bill_trace_fee
     *
     * @mbg.generated
     */
    private String billTraceFee;

    /**
     * Database Column Remarks:
     *   对账单中：入账金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.bill_entry_amount
     *
     * @mbg.generated
     */
    private String billEntryAmount;

    /**
     * Database Column Remarks:
     *   银行交易日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.trace_date
     *
     * @mbg.generated
     */
    private String traceDate;

    /**
     * Database Column Remarks:
     *   接到交易成功通知的时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.trace_success_time
     *
     * @mbg.generated
     */
    private String traceSuccessTime;

    /**
     * Database Column Remarks:
     *   (积分+优惠券)，总共抵扣的金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.discount_amount
     *
     * @mbg.generated
     */
    private String discountAmount;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     * Database Column Remarks:
     *   公司编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.old_bank_trace
     *
     * @mbg.generated
     */
    private String oldBankTrace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.buyer_id
     *
     * @mbg.generated
     */
    private String buyerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column funds_flow.buyer_logon_id
     *
     * @mbg.generated
     */
    private String buyerLogonId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.id
     *
     * @return the value of funds_flow.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.id
     *
     * @param id the value for funds_flow.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.order_id
     *
     * @return the value of funds_flow.order_id
     *
     * @mbg.generated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.order_id
     *
     * @param orderId the value for funds_flow.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.actual_amount
     *
     * @return the value of funds_flow.actual_amount
     *
     * @mbg.generated
     */
    public String getActualAmount() {
        return actualAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.actual_amount
     *
     * @param actualAmount the value for funds_flow.actual_amount
     *
     * @mbg.generated
     */
    public void setActualAmount(String actualAmount) {
        this.actualAmount = actualAmount == null ? null : actualAmount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.flow_type
     *
     * @return the value of funds_flow.flow_type
     *
     * @mbg.generated
     */
    public String getFlowType() {
        return flowType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.flow_type
     *
     * @param flowType the value for funds_flow.flow_type
     *
     * @mbg.generated
     */
    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.flow_sub_type
     *
     * @return the value of funds_flow.flow_sub_type
     *
     * @mbg.generated
     */
    public String getFlowSubType() {
        return flowSubType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.flow_sub_type
     *
     * @param flowSubType the value for funds_flow.flow_sub_type
     *
     * @mbg.generated
     */
    public void setFlowSubType(String flowSubType) {
        this.flowSubType = flowSubType == null ? null : flowSubType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.flow_status
     *
     * @return the value of funds_flow.flow_status
     *
     * @mbg.generated
     */
    public String getFlowStatus() {
        return flowStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.flow_status
     *
     * @param flowStatus the value for funds_flow.flow_status
     *
     * @mbg.generated
     */
    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus == null ? null : flowStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.update_time
     *
     * @return the value of funds_flow.update_time
     *
     * @mbg.generated
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.update_time
     *
     * @param updateTime the value for funds_flow.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.flow_txntime
     *
     * @return the value of funds_flow.flow_txntime
     *
     * @mbg.generated
     */
    public String getFlowTxntime() {
        return flowTxntime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.flow_txntime
     *
     * @param flowTxntime the value for funds_flow.flow_txntime
     *
     * @mbg.generated
     */
    public void setFlowTxntime(String flowTxntime) {
        this.flowTxntime = flowTxntime == null ? null : flowTxntime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.trace_time
     *
     * @return the value of funds_flow.trace_time
     *
     * @mbg.generated
     */
    public String getTraceTime() {
        return traceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.trace_time
     *
     * @param traceTime the value for funds_flow.trace_time
     *
     * @mbg.generated
     */
    public void setTraceTime(String traceTime) {
        this.traceTime = traceTime == null ? null : traceTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.bank_trace
     *
     * @return the value of funds_flow.bank_trace
     *
     * @mbg.generated
     */
    public String getBankTrace() {
        return bankTrace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.bank_trace
     *
     * @param bankTrace the value for funds_flow.bank_trace
     *
     * @mbg.generated
     */
    public void setBankTrace(String bankTrace) {
        this.bankTrace = bankTrace == null ? null : bankTrace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.pos_trace
     *
     * @return the value of funds_flow.pos_trace
     *
     * @mbg.generated
     */
    public String getPosTrace() {
        return posTrace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.pos_trace
     *
     * @param posTrace the value for funds_flow.pos_trace
     *
     * @mbg.generated
     */
    public void setPosTrace(String posTrace) {
        this.posTrace = posTrace == null ? null : posTrace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.card_id
     *
     * @return the value of funds_flow.card_id
     *
     * @mbg.generated
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.card_id
     *
     * @param cardId the value for funds_flow.card_id
     *
     * @mbg.generated
     */
    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.card_type
     *
     * @return the value of funds_flow.card_type
     *
     * @mbg.generated
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.card_type
     *
     * @param cardType the value for funds_flow.card_type
     *
     * @mbg.generated
     */
    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.issue_bankcode
     *
     * @return the value of funds_flow.issue_bankcode
     *
     * @mbg.generated
     */
    public String getIssueBankcode() {
        return issueBankcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.issue_bankcode
     *
     * @param issueBankcode the value for funds_flow.issue_bankcode
     *
     * @mbg.generated
     */
    public void setIssueBankcode(String issueBankcode) {
        this.issueBankcode = issueBankcode == null ? null : issueBankcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.memo
     *
     * @return the value of funds_flow.memo
     *
     * @mbg.generated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.memo
     *
     * @param memo the value for funds_flow.memo
     *
     * @mbg.generated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.bill_status
     *
     * @return the value of funds_flow.bill_status
     *
     * @mbg.generated
     */
    public String getBillStatus() {
        return billStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.bill_status
     *
     * @param billStatus the value for funds_flow.bill_status
     *
     * @mbg.generated
     */
    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.trade_no
     *
     * @return the value of funds_flow.trade_no
     *
     * @mbg.generated
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.trade_no
     *
     * @param tradeNo the value for funds_flow.trade_no
     *
     * @mbg.generated
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.query_id
     *
     * @return the value of funds_flow.query_id
     *
     * @mbg.generated
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.query_id
     *
     * @param queryId the value for funds_flow.query_id
     *
     * @mbg.generated
     */
    public void setQueryId(String queryId) {
        this.queryId = queryId == null ? null : queryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.old_flowid
     *
     * @return the value of funds_flow.old_flowid
     *
     * @mbg.generated
     */
    public Long getOldFlowid() {
        return oldFlowid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.old_flowid
     *
     * @param oldFlowid the value for funds_flow.old_flowid
     *
     * @mbg.generated
     */
    public void setOldFlowid(Long oldFlowid) {
        this.oldFlowid = oldFlowid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.refund_bankname
     *
     * @return the value of funds_flow.refund_bankname
     *
     * @mbg.generated
     */
    public String getRefundBankname() {
        return refundBankname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.refund_bankname
     *
     * @param refundBankname the value for funds_flow.refund_bankname
     *
     * @mbg.generated
     */
    public void setRefundBankname(String refundBankname) {
        this.refundBankname = refundBankname == null ? null : refundBankname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.refund_cardno
     *
     * @return the value of funds_flow.refund_cardno
     *
     * @mbg.generated
     */
    public String getRefundCardno() {
        return refundCardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.refund_cardno
     *
     * @param refundCardno the value for funds_flow.refund_cardno
     *
     * @mbg.generated
     */
    public void setRefundCardno(String refundCardno) {
        this.refundCardno = refundCardno == null ? null : refundCardno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.refund_trace
     *
     * @return the value of funds_flow.refund_trace
     *
     * @mbg.generated
     */
    public String getRefundTrace() {
        return refundTrace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.refund_trace
     *
     * @param refundTrace the value for funds_flow.refund_trace
     *
     * @mbg.generated
     */
    public void setRefundTrace(String refundTrace) {
        this.refundTrace = refundTrace == null ? null : refundTrace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.biz_num
     *
     * @return the value of funds_flow.biz_num
     *
     * @mbg.generated
     */
    public String getBizNum() {
        return bizNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.biz_num
     *
     * @param bizNum the value for funds_flow.biz_num
     *
     * @mbg.generated
     */
    public void setBizNum(String bizNum) {
        this.bizNum = bizNum == null ? null : bizNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.terminal_num
     *
     * @return the value of funds_flow.terminal_num
     *
     * @mbg.generated
     */
    public String getTerminalNum() {
        return terminalNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.terminal_num
     *
     * @param terminalNum the value for funds_flow.terminal_num
     *
     * @mbg.generated
     */
    public void setTerminalNum(String terminalNum) {
        this.terminalNum = terminalNum == null ? null : terminalNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.trace_type
     *
     * @return the value of funds_flow.trace_type
     *
     * @mbg.generated
     */
    public String getTraceType() {
        return traceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.trace_type
     *
     * @param traceType the value for funds_flow.trace_type
     *
     * @mbg.generated
     */
    public void setTraceType(String traceType) {
        this.traceType = traceType == null ? null : traceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.bill_file_name
     *
     * @return the value of funds_flow.bill_file_name
     *
     * @mbg.generated
     */
    public String getBillFileName() {
        return billFileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.bill_file_name
     *
     * @param billFileName the value for funds_flow.bill_file_name
     *
     * @mbg.generated
     */
    public void setBillFileName(String billFileName) {
        this.billFileName = billFileName == null ? null : billFileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.bill_trace_amount
     *
     * @return the value of funds_flow.bill_trace_amount
     *
     * @mbg.generated
     */
    public String getBillTraceAmount() {
        return billTraceAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.bill_trace_amount
     *
     * @param billTraceAmount the value for funds_flow.bill_trace_amount
     *
     * @mbg.generated
     */
    public void setBillTraceAmount(String billTraceAmount) {
        this.billTraceAmount = billTraceAmount == null ? null : billTraceAmount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.bill_trace_fee
     *
     * @return the value of funds_flow.bill_trace_fee
     *
     * @mbg.generated
     */
    public String getBillTraceFee() {
        return billTraceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.bill_trace_fee
     *
     * @param billTraceFee the value for funds_flow.bill_trace_fee
     *
     * @mbg.generated
     */
    public void setBillTraceFee(String billTraceFee) {
        this.billTraceFee = billTraceFee == null ? null : billTraceFee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.bill_entry_amount
     *
     * @return the value of funds_flow.bill_entry_amount
     *
     * @mbg.generated
     */
    public String getBillEntryAmount() {
        return billEntryAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.bill_entry_amount
     *
     * @param billEntryAmount the value for funds_flow.bill_entry_amount
     *
     * @mbg.generated
     */
    public void setBillEntryAmount(String billEntryAmount) {
        this.billEntryAmount = billEntryAmount == null ? null : billEntryAmount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.trace_date
     *
     * @return the value of funds_flow.trace_date
     *
     * @mbg.generated
     */
    public String getTraceDate() {
        return traceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.trace_date
     *
     * @param traceDate the value for funds_flow.trace_date
     *
     * @mbg.generated
     */
    public void setTraceDate(String traceDate) {
        this.traceDate = traceDate == null ? null : traceDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.trace_success_time
     *
     * @return the value of funds_flow.trace_success_time
     *
     * @mbg.generated
     */
    public String getTraceSuccessTime() {
        return traceSuccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.trace_success_time
     *
     * @param traceSuccessTime the value for funds_flow.trace_success_time
     *
     * @mbg.generated
     */
    public void setTraceSuccessTime(String traceSuccessTime) {
        this.traceSuccessTime = traceSuccessTime == null ? null : traceSuccessTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.discount_amount
     *
     * @return the value of funds_flow.discount_amount
     *
     * @mbg.generated
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.discount_amount
     *
     * @param discountAmount the value for funds_flow.discount_amount
     *
     * @mbg.generated
     */
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount == null ? null : discountAmount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.create_time
     *
     * @return the value of funds_flow.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.create_time
     *
     * @param createTime the value for funds_flow.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.company_id
     *
     * @return the value of funds_flow.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.company_id
     *
     * @param companyId the value for funds_flow.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.old_bank_trace
     *
     * @return the value of funds_flow.old_bank_trace
     *
     * @mbg.generated
     */
    public String getOldBankTrace() {
        return oldBankTrace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.old_bank_trace
     *
     * @param oldBankTrace the value for funds_flow.old_bank_trace
     *
     * @mbg.generated
     */
    public void setOldBankTrace(String oldBankTrace) {
        this.oldBankTrace = oldBankTrace == null ? null : oldBankTrace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.buyer_id
     *
     * @return the value of funds_flow.buyer_id
     *
     * @mbg.generated
     */
    public String getBuyerId() {
        return buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.buyer_id
     *
     * @param buyerId the value for funds_flow.buyer_id
     *
     * @mbg.generated
     */
    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column funds_flow.buyer_logon_id
     *
     * @return the value of funds_flow.buyer_logon_id
     *
     * @mbg.generated
     */
    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column funds_flow.buyer_logon_id
     *
     * @param buyerLogonId the value for funds_flow.buyer_logon_id
     *
     * @mbg.generated
     */
    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId == null ? null : buyerLogonId.trim();
    }
}

package sshloger.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SoftplatformCdr {

    @SerializedName("callId")
    @Expose
    private Integer callId;
    @SerializedName("softPlatformId")
    @Expose
    private Integer softPlatformId;
    @SerializedName("softPlatformName")
    @Expose
    private String softPlatformName;
    @SerializedName("softplatformCdrKey")
    @Expose
    private SoftplatformCdrKey softplatformCdrKey;
    @SerializedName("domainId")
    @Expose
    private Integer domainId;
    @SerializedName("hdwPlatformCode")
    @Expose
    private String hdwPlatformCode;
    @SerializedName("boardNum")
    @Expose
    private Integer boardNum;
    @SerializedName("trunkNum")
    @Expose
    private Integer trunkNum;
    @SerializedName("portNum")
    @Expose
    private Integer portNum;
    @SerializedName("providerCode")
    @Expose
    private String providerCode;
    @SerializedName("inbound")
    @Expose
    private Integer inbound;
    @SerializedName("appCode")
    @Expose
    private String appCode;
    @SerializedName("appActivationId")
    @Expose
    private Integer appActivationId;
    @SerializedName("calledNumber")
    @Expose
    private String calledNumber;
    @SerializedName("callingNumber")
    @Expose
    private String callingNumber;
    @SerializedName("timeCreatedOffset")
    @Expose
    private String timeCreatedOffset;
    @SerializedName("timeCreated")
    @Expose
    private TimeCreated timeCreated;
    @SerializedName("answeredOffset")
    @Expose
    private String answeredOffset;
    @SerializedName("answered")
    @Expose
    private Answered answered;
    @SerializedName("progressOffset")
    @Expose
    private String progressOffset;
    @SerializedName("progress")
    @Expose
    private Progress progress;
    @SerializedName("alertingOffset")
    @Expose
    private String alertingOffset;
    @SerializedName("alerting")
    @Expose
    private Alerting alerting;
    @SerializedName("disconnectedOffset")
    @Expose
    private String disconnectedOffset;
    @SerializedName("disconnected")
    @Expose
    private Disconnected disconnected;
    @SerializedName("durationCall")
    @Expose
    private Integer durationCall;
    @SerializedName("durationTalk")
    @Expose
    private Integer durationTalk;
    @SerializedName("discReason")
    @Expose
    private Integer discReason;
    @SerializedName("discReasonHdw")
    @Expose
    private Integer discReasonHdw;
    @SerializedName("accountName")
    @Expose
    private String accountName;
    @SerializedName("calledNumberOrig")
    @Expose
    private String calledNumberOrig;
    @SerializedName("callingNumberOrig")
    @Expose
    private String callingNumberOrig;
    @SerializedName("contextId")
    @Expose
    private long contextId;
    @SerializedName("commonContextId")
    @Expose
    private long commonContextId;
    @SerializedName("accountCode")
    @Expose
    private String accountCode;
    @SerializedName("tryId")
    @Expose
    private Integer tryId;
    @SerializedName("calledRegionId")
    @Expose
    private Integer calledRegionId;
    @SerializedName("abonentId")
    @Expose
    private String abonentId;
    @SerializedName("serviceCode")
    @Expose
    private String serviceCode;
    @SerializedName("line")
    @Expose
    private String line;
    @SerializedName("redirectingCount")
    @Expose
    private Integer redirectingCount;
    @SerializedName("progressBitCard")
    @Expose
    private Integer progressBitCard;
    @SerializedName("discReasonVats")
    @Expose
    private Integer discReasonVats;
    @SerializedName("clir")
    @Expose
    private Integer clir;
    @SerializedName("userAgent")
    @Expose
    private String userAgent;
    @SerializedName("sipCallId")
    @Expose
    private String sipCallId;
    @SerializedName("isChangeDataSource")
    @Expose
    private Boolean isChangeDataSource;
    @SerializedName("calledNumberTypeOrig")
    @Expose
    private Integer calledNumberTypeOrig;
    @SerializedName("callingNumberTypeOrig")
    @Expose
    private Integer callingNumberTypeOrig;

    public Integer getCallId() {
        return callId;
    }

    public void setCallId(Integer callId) {
        this.callId = callId;
    }

    public SoftplatformCdr withCallId(Integer callId) {
        this.callId = callId;
        return this;
    }

    public Integer getSoftPlatformId() {
        return softPlatformId;
    }

    public void setSoftPlatformId(Integer softPlatformId) {
        this.softPlatformId = softPlatformId;
    }

    public SoftplatformCdr withSoftPlatformId(Integer softPlatformId) {
        this.softPlatformId = softPlatformId;
        return this;
    }

    public String getSoftPlatformName() {
        return softPlatformName;
    }

    public void setSoftPlatformName(String softPlatformName) {
        this.softPlatformName = softPlatformName;
    }

    public SoftplatformCdr withSoftPlatformName(String softPlatformName) {
        this.softPlatformName = softPlatformName;
        return this;
    }

    public SoftplatformCdrKey getSoftplatformCdrKey() {
        return softplatformCdrKey;
    }

    public void setSoftplatformCdrKey(SoftplatformCdrKey softplatformCdrKey) {
        this.softplatformCdrKey = softplatformCdrKey;
    }

    public SoftplatformCdr withSoftplatformCdrKey(SoftplatformCdrKey softplatformCdrKey) {
        this.softplatformCdrKey = softplatformCdrKey;
        return this;
    }

    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public SoftplatformCdr withDomainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }

    public String getHdwPlatformCode() {
        return hdwPlatformCode;
    }

    public void setHdwPlatformCode(String hdwPlatformCode) {
        this.hdwPlatformCode = hdwPlatformCode;
    }

    public SoftplatformCdr withHdwPlatformCode(String hdwPlatformCode) {
        this.hdwPlatformCode = hdwPlatformCode;
        return this;
    }

    public Integer getBoardNum() {
        return boardNum;
    }

    public void setBoardNum(Integer boardNum) {
        this.boardNum = boardNum;
    }

    public SoftplatformCdr withBoardNum(Integer boardNum) {
        this.boardNum = boardNum;
        return this;
    }

    public Integer getTrunkNum() {
        return trunkNum;
    }

    public void setTrunkNum(Integer trunkNum) {
        this.trunkNum = trunkNum;
    }

    public SoftplatformCdr withTrunkNum(Integer trunkNum) {
        this.trunkNum = trunkNum;
        return this;
    }

    public Integer getPortNum() {
        return portNum;
    }

    public void setPortNum(Integer portNum) {
        this.portNum = portNum;
    }

    public SoftplatformCdr withPortNum(Integer portNum) {
        this.portNum = portNum;
        return this;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public SoftplatformCdr withProviderCode(String providerCode) {
        this.providerCode = providerCode;
        return this;
    }

    public Integer getInbound() {
        return inbound;
    }

    public void setInbound(Integer inbound) {
        this.inbound = inbound;
    }

    public SoftplatformCdr withInbound(Integer inbound) {
        this.inbound = inbound;
        return this;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public SoftplatformCdr withAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    public Integer getAppActivationId() {
        return appActivationId;
    }

    public void setAppActivationId(Integer appActivationId) {
        this.appActivationId = appActivationId;
    }

    public SoftplatformCdr withAppActivationId(Integer appActivationId) {
        this.appActivationId = appActivationId;
        return this;
    }

    public String getCalledNumber() {
        return calledNumber;
    }

    public void setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
    }

    public SoftplatformCdr withCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }

    public String getCallingNumber() {
        return callingNumber;
    }

    public void setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
    }

    public SoftplatformCdr withCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }

    public String getTimeCreatedOffset() {
        return timeCreatedOffset;
    }

    public void setTimeCreatedOffset(String timeCreatedOffset) {
        this.timeCreatedOffset = timeCreatedOffset;
    }

    public SoftplatformCdr withTimeCreatedOffset(String timeCreatedOffset) {
        this.timeCreatedOffset = timeCreatedOffset;
        return this;
    }

    public TimeCreated getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(TimeCreated timeCreated) {
        this.timeCreated = timeCreated;
    }

    public SoftplatformCdr withTimeCreated(TimeCreated timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

    public String getAnsweredOffset() {
        return answeredOffset;
    }

    public void setAnsweredOffset(String answeredOffset) {
        this.answeredOffset = answeredOffset;
    }

    public SoftplatformCdr withAnsweredOffset(String answeredOffset) {
        this.answeredOffset = answeredOffset;
        return this;
    }

    public Answered getAnswered() {
        return answered;
    }

    public void setAnswered(Answered answered) {
        this.answered = answered;
    }

    public SoftplatformCdr withAnswered(Answered answered) {
        this.answered = answered;
        return this;
    }

    public String getProgressOffset() {
        return progressOffset;
    }

    public void setProgressOffset(String progressOffset) {
        this.progressOffset = progressOffset;
    }

    public SoftplatformCdr withProgressOffset(String progressOffset) {
        this.progressOffset = progressOffset;
        return this;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public SoftplatformCdr withProgress(Progress progress) {
        this.progress = progress;
        return this;
    }

    public String getAlertingOffset() {
        return alertingOffset;
    }

    public void setAlertingOffset(String alertingOffset) {
        this.alertingOffset = alertingOffset;
    }

    public SoftplatformCdr withAlertingOffset(String alertingOffset) {
        this.alertingOffset = alertingOffset;
        return this;
    }

    public Alerting getAlerting() {
        return alerting;
    }

    public void setAlerting(Alerting alerting) {
        this.alerting = alerting;
    }

    public SoftplatformCdr withAlerting(Alerting alerting) {
        this.alerting = alerting;
        return this;
    }

    public String getDisconnectedOffset() {
        return disconnectedOffset;
    }

    public void setDisconnectedOffset(String disconnectedOffset) {
        this.disconnectedOffset = disconnectedOffset;
    }

    public SoftplatformCdr withDisconnectedOffset(String disconnectedOffset) {
        this.disconnectedOffset = disconnectedOffset;
        return this;
    }

    public Disconnected getDisconnected() {
        return disconnected;
    }

    public void setDisconnected(Disconnected disconnected) {
        this.disconnected = disconnected;
    }

    public SoftplatformCdr withDisconnected(Disconnected disconnected) {
        this.disconnected = disconnected;
        return this;
    }

    public Integer getDurationCall() {
        return durationCall;
    }

    public void setDurationCall(Integer durationCall) {
        this.durationCall = durationCall;
    }

    public SoftplatformCdr withDurationCall(Integer durationCall) {
        this.durationCall = durationCall;
        return this;
    }

    public Integer getDurationTalk() {
        return durationTalk;
    }

    public void setDurationTalk(Integer durationTalk) {
        this.durationTalk = durationTalk;
    }

    public SoftplatformCdr withDurationTalk(Integer durationTalk) {
        this.durationTalk = durationTalk;
        return this;
    }

    public Integer getDiscReason() {
        return discReason;
    }

    public void setDiscReason(Integer discReason) {
        this.discReason = discReason;
    }

    public SoftplatformCdr withDiscReason(Integer discReason) {
        this.discReason = discReason;
        return this;
    }

    public Integer getDiscReasonHdw() {
        return discReasonHdw;
    }

    public void setDiscReasonHdw(Integer discReasonHdw) {
        this.discReasonHdw = discReasonHdw;
    }

    public SoftplatformCdr withDiscReasonHdw(Integer discReasonHdw) {
        this.discReasonHdw = discReasonHdw;
        return this;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public SoftplatformCdr withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public String getCalledNumberOrig() {
        return calledNumberOrig;
    }

    public void setCalledNumberOrig(String calledNumberOrig) {
        this.calledNumberOrig = calledNumberOrig;
    }

    public SoftplatformCdr withCalledNumberOrig(String calledNumberOrig) {
        this.calledNumberOrig = calledNumberOrig;
        return this;
    }

    public String getCallingNumberOrig() {
        return callingNumberOrig;
    }

    public void setCallingNumberOrig(String callingNumberOrig) {
        this.callingNumberOrig = callingNumberOrig;
    }

    public SoftplatformCdr withCallingNumberOrig(String callingNumberOrig) {
        this.callingNumberOrig = callingNumberOrig;
        return this;
    }

    public long getContextId() {
        return contextId;
    }

    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }

    public SoftplatformCdr withContextId(Integer contextId) {
        this.contextId = contextId;
        return this;
    }

    public long getCommonContextId() {
        return commonContextId;
    }

    public void setCommonContextId(Integer commonContextId) {
        this.commonContextId = commonContextId;
    }

    public SoftplatformCdr withCommonContextId(Integer commonContextId) {
        this.commonContextId = commonContextId;
        return this;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public SoftplatformCdr withAccountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }

    public Integer getTryId() {
        return tryId;
    }

    public void setTryId(Integer tryId) {
        this.tryId = tryId;
    }

    public SoftplatformCdr withTryId(Integer tryId) {
        this.tryId = tryId;
        return this;
    }

    public Integer getCalledRegionId() {
        return calledRegionId;
    }

    public void setCalledRegionId(Integer calledRegionId) {
        this.calledRegionId = calledRegionId;
    }

    public SoftplatformCdr withCalledRegionId(Integer calledRegionId) {
        this.calledRegionId = calledRegionId;
        return this;
    }

    public String getAbonentId() {
        return abonentId;
    }

    public void setAbonentId(String abonentId) {
        this.abonentId = abonentId;
    }

    public SoftplatformCdr withAbonentId(String abonentId) {
        this.abonentId = abonentId;
        return this;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public SoftplatformCdr withServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public SoftplatformCdr withLine(String line) {
        this.line = line;
        return this;
    }

    public Integer getRedirectingCount() {
        return redirectingCount;
    }

    public void setRedirectingCount(Integer redirectingCount) {
        this.redirectingCount = redirectingCount;
    }

    public SoftplatformCdr withRedirectingCount(Integer redirectingCount) {
        this.redirectingCount = redirectingCount;
        return this;
    }

    public Integer getProgressBitCard() {
        return progressBitCard;
    }

    public void setProgressBitCard(Integer progressBitCard) {
        this.progressBitCard = progressBitCard;
    }

    public SoftplatformCdr withProgressBitCard(Integer progressBitCard) {
        this.progressBitCard = progressBitCard;
        return this;
    }

    public Integer getDiscReasonVats() {
        return discReasonVats;
    }

    public void setDiscReasonVats(Integer discReasonVats) {
        this.discReasonVats = discReasonVats;
    }

    public SoftplatformCdr withDiscReasonVats(Integer discReasonVats) {
        this.discReasonVats = discReasonVats;
        return this;
    }

    public Integer getClir() {
        return clir;
    }

    public void setClir(Integer clir) {
        this.clir = clir;
    }

    public SoftplatformCdr withClir(Integer clir) {
        this.clir = clir;
        return this;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public SoftplatformCdr withUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public String getSipCallId() {
        return sipCallId;
    }

    public void setSipCallId(String sipCallId) {
        this.sipCallId = sipCallId;
    }

    public SoftplatformCdr withSipCallId(String sipCallId) {
        this.sipCallId = sipCallId;
        return this;
    }

    public Boolean getIsChangeDataSource() {
        return isChangeDataSource;
    }

    public void setIsChangeDataSource(Boolean isChangeDataSource) {
        this.isChangeDataSource = isChangeDataSource;
    }

    public SoftplatformCdr withIsChangeDataSource(Boolean isChangeDataSource) {
        this.isChangeDataSource = isChangeDataSource;
        return this;
    }

    public Integer getCalledNumberTypeOrig() {
        return calledNumberTypeOrig;
    }

    public void setCalledNumberTypeOrig(Integer calledNumberTypeOrig) {
        this.calledNumberTypeOrig = calledNumberTypeOrig;
    }

    public SoftplatformCdr withCalledNumberTypeOrig(Integer calledNumberTypeOrig) {
        this.calledNumberTypeOrig = calledNumberTypeOrig;
        return this;
    }

    public Integer getCallingNumberTypeOrig() {
        return callingNumberTypeOrig;
    }

    public void setCallingNumberTypeOrig(Integer callingNumberTypeOrig) {
        this.callingNumberTypeOrig = callingNumberTypeOrig;
    }

    public SoftplatformCdr withCallingNumberTypeOrig(Integer callingNumberTypeOrig) {
        this.callingNumberTypeOrig = callingNumberTypeOrig;
        return this;
    }

}

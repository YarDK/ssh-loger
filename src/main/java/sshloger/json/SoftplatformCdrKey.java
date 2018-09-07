
package sshloger.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SoftplatformCdrKey {

    @SerializedName("callId")
    @Expose
    private Integer callId;
    @SerializedName("softPlatformId")
    @Expose
    private Integer softPlatformId;
    @SerializedName("domainId")
    @Expose
    private Integer domainId;

    public Integer getCallId() {
        return callId;
    }

    public void setCallId(Integer callId) {
        this.callId = callId;
    }

    public SoftplatformCdrKey withCallId(Integer callId) {
        this.callId = callId;
        return this;
    }

    public Integer getSoftPlatformId() {
        return softPlatformId;
    }

    public void setSoftPlatformId(Integer softPlatformId) {
        this.softPlatformId = softPlatformId;
    }

    public SoftplatformCdrKey withSoftPlatformId(Integer softPlatformId) {
        this.softPlatformId = softPlatformId;
        return this;
    }

    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public SoftplatformCdrKey withDomainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }

}

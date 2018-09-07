
package sshloger.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainJSON {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("result")
    @Expose
    private Boolean result;
    @SerializedName("SoftplatformCdrs")
    @Expose
    private List<SoftplatformCdr> softplatformCdrs = null;
    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public MainJSON withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public MainJSON withResult(Boolean result) {
        this.result = result;
        return this;
    }

    public List<SoftplatformCdr> getSoftplatformCdrs() {
        return softplatformCdrs;
    }

    public void setSoftplatformCdrs(List<SoftplatformCdr> softplatformCdrs) {
        this.softplatformCdrs = softplatformCdrs;
    }

    public MainJSON withSoftplatformCdrs(List<SoftplatformCdr> softplatformCdrs) {
        this.softplatformCdrs = softplatformCdrs;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public MainJSON withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

}

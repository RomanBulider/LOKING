package com.roman.builder.learn.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenxl11
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SubsInfo extends Model<SubsInfo> {

    private static final long serialVersionUID = 1L;

    @TableId("SUBS_ID")
    private String subsId;

    @TableField("SYS_ID")
    private String sysId;

    @TableField("TENANT_ID")
    private String tenantId;

    @TableField("USER_TYPE")
    private String userType;

    @TableField("ACCT_ID")
    private String acctId;

    @TableField("CUST_ID")
    private String custId;

    @TableField("BASIC_ORG_ID")
    private String basicOrgId;

    @TableField("SUBS_STATUS")
    private String subsStatus;

    @TableField("JOIN_TIME")
    private LocalDateTime joinTime;

    @TableField("SERVICE_STATUS")
    private String serviceStatus;

    @TableField("STATUS_CHG_TYPE")
    private String statusChgType;

    @TableField("STATUS_CHG_TIME")
    private LocalDateTime statusChgTime;

    @TableField("COUNTRY_CODE")
    private String countryCode;

    @TableField("PROVINCE_CODE")
    private String provinceCode;

    @TableField("CITY_CODE")
    private String cityCode;

    @TableField("SERVICE_NUM")
    private String serviceNum;

    @TableField("ICCID")
    private String iccid;

    @TableField("VEHICLE_ID")
    private String vehicleId;

    @TableField("VECHICLE_NAME")
    private String vechicleName;

    @TableField("VECHICLE_TYPE")
    private String vechicleType;

    @TableField("PLATE_NUM")
    private String plateNum;

    @TableField("OPER_ID")
    private String operId;

    @TableField("CREDIT_VALUE")
    private String creditValue;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("EFF_TIME")
    private LocalDateTime effTime;

    @TableField("EXP_TIME")
    private LocalDateTime expTime;

    @TableField("EMAIL")
    private String email;

    @TableField("CUST_NAME")
    private String custName;

    @TableField("PASS_WD")
    private String passWd;

    @TableField("CONTACT_NUM")
    private String contactNum;

    @TableField("CONTACT_ADD")
    private String contactAdd;

    @TableField("IMSI")
    private String imsi;

    @TableField("IMSI1")
    private String imsi1;

    @TableField("IMSI2")
    private String imsi2;

    @TableField("NET_CODE")
    private String netCode;

    @TableField("DEPART_ID")
    private String departId;

    @TableField("CHLID")
    private String chlid;

    @TableField("PAY_TYPE")
    private String payType;

    private String remark;

    @TableField("OPT_SUBSID")
    private String optSubsid;

    @TableField("FIRST_ACTIVE_DATE")
    private LocalDateTime firstActiveDate;

    @TableField("EQU_TYPE")
    private String equType;


    @Override
    protected Serializable pkVal() {
        return this.subsId;
    }

}

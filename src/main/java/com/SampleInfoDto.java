package com;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 出样机信息.
 *
 * @author 路天文
 * @date 2018/10/23 13:51
 */
public class SampleInfoDto implements Serializable {

  private Integer id;

  private Integer customerId;

  private Integer siteId;

  private String siteName;

  private String industryCode;

  private String industryName;

  private Integer brandId;

  private String brandName;

  private Integer sampleType;

  private Integer itemId;

  private String productCode;

  private String itemModel;

  private String itemName;

  private String barcode;

  private BigDecimal marketPrice;

  private Date loadSampleDate;

  private Boolean isCheck;

  private String itemPicUrl;

  private String errorMsg;

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getSiteId() {
    return siteId;
  }

  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public String getIndustryCode() {
    return industryCode;
  }

  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }

  public Integer getSampleType() {
    return sampleType;
  }

  public void setSampleType(Integer sampleType) {
    this.sampleType = sampleType;
  }

  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getItemModel() {
    return itemModel;
  }

  public void setItemModel(String itemModel) {
    this.itemModel = itemModel;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public BigDecimal getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(BigDecimal marketPrice) {
    this.marketPrice = marketPrice;
  }

  public Date getLoadSampleDate() {
    return loadSampleDate;
  }

  public void setLoadSampleDate(Date loadSampleDate) {
    this.loadSampleDate = loadSampleDate;
  }

  public Boolean getIsCheck() {
    return isCheck;
  }

  public void setIsCheck(Boolean isCheck) {
    this.isCheck = isCheck;
  }

  public String getIndustryName() {
    return industryName;
  }

  public void setIndustryName(String industryName) {
    this.industryName = industryName;
  }

  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getItemPicUrl() {
    return itemPicUrl;
  }

  public void setItemPicUrl(String itemPicUrl) {
    this.itemPicUrl = itemPicUrl;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }
}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.08 at 11:54:51 AM EEST 
//


package com.ibm.filenet.deployment.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ibm.filenet.deployment.xml.DeleteCreatedFilesOnError;
import com.ibm.filenet.deployment.xml.DisplayReportWhenDone;
import com.ibm.filenet.deployment.xml.FailureLimit;
import com.ibm.filenet.deployment.xml.GenerateDetailedReport;
import com.ibm.filenet.deployment.xml.ImportObjectId;
import com.ibm.filenet.deployment.xml.ImportOwner;
import com.ibm.filenet.deployment.xml.ImportRetention;
import com.ibm.filenet.deployment.xml.ImportSecurity;
import com.ibm.filenet.deployment.xml.RemovePropertyDefinitions;
import com.ibm.filenet.deployment.xml.StoragePolicy;
import com.ibm.filenet.deployment.xml.TransferWorkflows;
import com.ibm.filenet.deployment.xml.UpdateLocalizedProperties;
import com.ibm.filenet.deployment.xml.UseOriginalTimestamps;
import com.ibm.filenet.deployment.xml.ValidationOutput;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Environment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pair" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeployDataSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeployDataSetCatalogFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PEConfigFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionSetPath" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{}CreateOption" minOccurs="0"/>
 *         &lt;element ref="{}UpdateOption" minOccurs="0"/>
 *         &lt;element ref="{}AuditOption" minOccurs="0"/>
 *         &lt;element ref="{}WorkflowConfigurationOption" minOccurs="0"/>
 *         &lt;element ref="{}StoragePolicy" minOccurs="0"/>
 *         &lt;element ref="{}DeleteCreatedFilesOnError" minOccurs="0"/>
 *         &lt;element ref="{}ImportSecurity" minOccurs="0"/>
 *         &lt;element ref="{}ImportOwner" minOccurs="0"/>
 *         &lt;element ref="{}ImportObjectId" minOccurs="0"/>
 *         &lt;element ref="{}ImportRetention" minOccurs="0"/>
 *         &lt;element ref="{}RemovePropertyDefinitions" minOccurs="0"/>
 *         &lt;element ref="{}UseOriginalTimestamps" minOccurs="0"/>
 *         &lt;element ref="{}TransferWorkflows" minOccurs="0"/>
 *         &lt;element ref="{}UpdateLocalizedProperties" minOccurs="0"/>
 *         &lt;element ref="{}FailureLimit" minOccurs="0"/>
 *         &lt;element ref="{}GenerateDetailedReport" minOccurs="0"/>
 *         &lt;element ref="{}DisplayReportWhenDone" minOccurs="0"/>
 *         &lt;element ref="{}GenerateAuditReport" minOccurs="0"/>
 *         &lt;element name="ReportFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}ValidationOutput" minOccurs="0"/>
 *         &lt;element name="Scripts" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute ref="{}importCreateOption"/>
 *       &lt;attribute ref="{}importUpdateOption"/>
 *       &lt;attribute ref="{}peImportOption"/>
 *       &lt;attribute name="analysisFailuresLimit" type="{http://www.w3.org/2001/XMLSchema}string" default="100" />
 *       &lt;attribute name="deleteAnalysisResultsFileOnError" type="{}boolean" default="true" />
 *       &lt;attribute name="deleteDestinationFilesOnError" type="{}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ImportDeployDataSet")
public class ImportDeployDataSet implements IOperation {

    @XmlElement(name = "Environment")
    protected String environment;
    @XmlElement(name = "Pair")
    protected String pair;
    @XmlElement(name = "DeployDataSet")
    protected String deployDataSet;
    @XmlElement(name = "DeployDataSetCatalogFilePath")
    protected String deployDataSetCatalogFilePath;
    @XmlElement(name = "PEConfigFileName")
    protected String peConfigFileName;
    @XmlElement(name = "OptionSetPath")
    protected Object optionSetPath;
    @XmlElement(name = "CreateOption", defaultValue = "CreateAlways")
    protected String createOption;
    @XmlElement(name = "UpdateOption", defaultValue = "UpdateIfNewer")
    protected String updateOption;
    @XmlElement(name = "AuditOption", defaultValue = "ImportOnly")
    protected String auditOption;
    @XmlElement(name = "WorkflowConfigurationOption", defaultValue = "Merge")
    protected String workflowConfigurationOption;
    @XmlElement(name = "StoragePolicy")
    protected StoragePolicy storagePolicy;
    @XmlElement(name = "DeleteCreatedFilesOnError")
    protected DeleteCreatedFilesOnError deleteCreatedFilesOnError;
    @XmlElement(name = "ImportSecurity")
    protected ImportSecurity importSecurity;
    @XmlElement(name = "ImportOwner")
    protected ImportOwner importOwner;
    @XmlElement(name = "ImportObjectId")
    protected ImportObjectId importObjectId;
    @XmlElement(name = "ImportRetention")
    protected ImportRetention importRetention;
    @XmlElement(name = "RemovePropertyDefinitions")
    protected RemovePropertyDefinitions removePropertyDefinitions;
    @XmlElement(name = "UseOriginalTimestamps")
    protected UseOriginalTimestamps useOriginalTimestamps;
    @XmlElement(name = "TransferWorkflows")
    protected TransferWorkflows transferWorkflows;
    @XmlElement(name = "UpdateLocalizedProperties")
    protected UpdateLocalizedProperties updateLocalizedProperties;
    @XmlElement(name = "FailureLimit")
    protected FailureLimit failureLimit;
    @XmlElement(name = "GenerateDetailedReport")
    protected GenerateDetailedReport generateDetailedReport;
    @XmlElement(name = "DisplayReportWhenDone")
    protected DisplayReportWhenDone displayReportWhenDone;
    @XmlElement(name = "GenerateAuditReport")
    protected GenerateAuditReport generateAuditReport;
    @XmlElement(name = "ReportFileName")
    protected String reportFileName;
    @XmlElement(name = "ValidationOutput")
    protected ValidationOutput validationOutput;
    @XmlElement(name = "Scripts")
    protected Object scripts;
    @XmlAttribute(name = "importCreateOption")
    protected String importCreateOption;
    @XmlAttribute(name = "importUpdateOption")
    protected String importUpdateOption;
    @XmlAttribute(name = "peImportOption")
    protected String peImportOption;
    @XmlAttribute(name = "analysisFailuresLimit")
    protected String analysisFailuresLimit;
    @XmlAttribute(name = "deleteAnalysisResultsFileOnError")
    protected String deleteAnalysisResultsFileOnError;
    @XmlAttribute(name = "deleteDestinationFilesOnError")
    protected String deleteDestinationFilesOnError;

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the pair property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPair() {
        return pair;
    }

    /**
     * Sets the value of the pair property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPair(String value) {
        this.pair = value;
    }

    /**
     * Gets the value of the deployDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeployDataSet() {
        return deployDataSet;
    }

    /**
     * Sets the value of the deployDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeployDataSet(String value) {
        this.deployDataSet = value;
    }

    /**
     * Gets the value of the deployDataSetCatalogFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeployDataSetCatalogFilePath() {
        return deployDataSetCatalogFilePath;
    }

    /**
     * Sets the value of the deployDataSetCatalogFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeployDataSetCatalogFilePath(String value) {
        this.deployDataSetCatalogFilePath = value;
    }

    /**
     * Gets the value of the peConfigFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEConfigFileName() {
        return peConfigFileName;
    }

    /**
     * Sets the value of the peConfigFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEConfigFileName(String value) {
        this.peConfigFileName = value;
    }

    /**
     * Gets the value of the optionSetPath property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOptionSetPath() {
        return optionSetPath;
    }

    /**
     * Sets the value of the optionSetPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOptionSetPath(Object value) {
        this.optionSetPath = value;
    }

    /**
     * Gets the value of the createOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateOption() {
        return createOption;
    }

    /**
     * Sets the value of the createOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateOption(String value) {
        this.createOption = value;
    }

    /**
     * Gets the value of the updateOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateOption() {
        return updateOption;
    }

    /**
     * Sets the value of the updateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateOption(String value) {
        this.updateOption = value;
    }

    /**
     * Gets the value of the auditOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditOption() {
        return auditOption;
    }

    /**
     * Sets the value of the auditOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditOption(String value) {
        this.auditOption = value;
    }

    /**
     * Gets the value of the workflowConfigurationOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowConfigurationOption() {
        return workflowConfigurationOption;
    }

    /**
     * Sets the value of the workflowConfigurationOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowConfigurationOption(String value) {
        this.workflowConfigurationOption = value;
    }

    /**
     * Gets the value of the storagePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link StoragePolicy }
     *     
     */
    public StoragePolicy getStoragePolicy() {
        return storagePolicy;
    }

    /**
     * Sets the value of the storagePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoragePolicy }
     *     
     */
    public void setStoragePolicy(StoragePolicy value) {
        this.storagePolicy = value;
    }

    /**
     * Gets the value of the deleteCreatedFilesOnError property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteCreatedFilesOnError }
     *     
     */
    public DeleteCreatedFilesOnError getDeleteCreatedFilesOnError() {
        return deleteCreatedFilesOnError;
    }

    /**
     * Sets the value of the deleteCreatedFilesOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteCreatedFilesOnError }
     *     
     */
    public void setDeleteCreatedFilesOnError(DeleteCreatedFilesOnError value) {
        this.deleteCreatedFilesOnError = value;
    }

    /**
     * Gets the value of the importSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link ImportSecurity }
     *     
     */
    public ImportSecurity getImportSecurity() {
        return importSecurity;
    }

    /**
     * Sets the value of the importSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportSecurity }
     *     
     */
    public void setImportSecurity(ImportSecurity value) {
        this.importSecurity = value;
    }

    /**
     * Gets the value of the importOwner property.
     * 
     * @return
     *     possible object is
     *     {@link ImportOwner }
     *     
     */
    public ImportOwner getImportOwner() {
        return importOwner;
    }

    /**
     * Sets the value of the importOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportOwner }
     *     
     */
    public void setImportOwner(ImportOwner value) {
        this.importOwner = value;
    }

    /**
     * Gets the value of the importObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link ImportObjectId }
     *     
     */
    public ImportObjectId getImportObjectId() {
        return importObjectId;
    }

    /**
     * Sets the value of the importObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportObjectId }
     *     
     */
    public void setImportObjectId(ImportObjectId value) {
        this.importObjectId = value;
    }

    /**
     * Gets the value of the importRetention property.
     * 
     * @return
     *     possible object is
     *     {@link ImportRetention }
     *     
     */
    public ImportRetention getImportRetention() {
        return importRetention;
    }

    /**
     * Sets the value of the importRetention property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportRetention }
     *     
     */
    public void setImportRetention(ImportRetention value) {
        this.importRetention = value;
    }

    /**
     * Gets the value of the removePropertyDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link RemovePropertyDefinitions }
     *     
     */
    public RemovePropertyDefinitions getRemovePropertyDefinitions() {
        return removePropertyDefinitions;
    }

    /**
     * Sets the value of the removePropertyDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemovePropertyDefinitions }
     *     
     */
    public void setRemovePropertyDefinitions(RemovePropertyDefinitions value) {
        this.removePropertyDefinitions = value;
    }

    /**
     * Gets the value of the useOriginalTimestamps property.
     * 
     * @return
     *     possible object is
     *     {@link UseOriginalTimestamps }
     *     
     */
    public UseOriginalTimestamps getUseOriginalTimestamps() {
        return useOriginalTimestamps;
    }

    /**
     * Sets the value of the useOriginalTimestamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseOriginalTimestamps }
     *     
     */
    public void setUseOriginalTimestamps(UseOriginalTimestamps value) {
        this.useOriginalTimestamps = value;
    }

    /**
     * Gets the value of the transferWorkflows property.
     * 
     * @return
     *     possible object is
     *     {@link TransferWorkflows }
     *     
     */
    public TransferWorkflows getTransferWorkflows() {
        return transferWorkflows;
    }

    /**
     * Sets the value of the transferWorkflows property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferWorkflows }
     *     
     */
    public void setTransferWorkflows(TransferWorkflows value) {
        this.transferWorkflows = value;
    }

    /**
     * Gets the value of the updateLocalizedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLocalizedProperties }
     *     
     */
    public UpdateLocalizedProperties getUpdateLocalizedProperties() {
        return updateLocalizedProperties;
    }

    /**
     * Sets the value of the updateLocalizedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLocalizedProperties }
     *     
     */
    public void setUpdateLocalizedProperties(UpdateLocalizedProperties value) {
        this.updateLocalizedProperties = value;
    }

    /**
     * Gets the value of the failureLimit property.
     * 
     * @return
     *     possible object is
     *     {@link FailureLimit }
     *     
     */
    public FailureLimit getFailureLimit() {
        return failureLimit;
    }

    /**
     * Sets the value of the failureLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureLimit }
     *     
     */
    public void setFailureLimit(FailureLimit value) {
        this.failureLimit = value;
    }

    /**
     * Gets the value of the generateDetailedReport property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateDetailedReport }
     *     
     */
    public GenerateDetailedReport getGenerateDetailedReport() {
        return generateDetailedReport;
    }

    /**
     * Sets the value of the generateDetailedReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateDetailedReport }
     *     
     */
    public void setGenerateDetailedReport(GenerateDetailedReport value) {
        this.generateDetailedReport = value;
    }

    /**
     * Gets the value of the displayReportWhenDone property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayReportWhenDone }
     *     
     */
    public DisplayReportWhenDone getDisplayReportWhenDone() {
        return displayReportWhenDone;
    }

    /**
     * Sets the value of the displayReportWhenDone property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayReportWhenDone }
     *     
     */
    public void setDisplayReportWhenDone(DisplayReportWhenDone value) {
        this.displayReportWhenDone = value;
    }

    /**
     * Gets the value of the generateAuditReport property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateAuditReport }
     *     
     */
    public GenerateAuditReport getGenerateAuditReport() {
        return generateAuditReport;
    }

    /**
     * Sets the value of the generateAuditReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateAuditReport }
     *     
     */
    public void setGenerateAuditReport(GenerateAuditReport value) {
        this.generateAuditReport = value;
    }

    /**
     * Gets the value of the reportFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportFileName() {
        return reportFileName;
    }

    /**
     * Sets the value of the reportFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportFileName(String value) {
        this.reportFileName = value;
    }

    /**
     * Gets the value of the validationOutput property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationOutput }
     *     
     */
    public ValidationOutput getValidationOutput() {
        return validationOutput;
    }

    /**
     * Sets the value of the validationOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationOutput }
     *     
     */
    public void setValidationOutput(ValidationOutput value) {
        this.validationOutput = value;
    }

    /**
     * Gets the value of the scripts property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getScripts() {
        return scripts;
    }

    /**
     * Sets the value of the scripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setScripts(Object value) {
        this.scripts = value;
    }

    /**
     * Gets the value of the importCreateOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportCreateOption() {
        if (importCreateOption == null) {
            return "CreateAlways";
        } else {
            return importCreateOption;
        }
    }

    /**
     * Sets the value of the importCreateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportCreateOption(String value) {
        this.importCreateOption = value;
    }

    /**
     * Gets the value of the importUpdateOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportUpdateOption() {
        if (importUpdateOption == null) {
            return "UpdateIfNewer";
        } else {
            return importUpdateOption;
        }
    }

    /**
     * Sets the value of the importUpdateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportUpdateOption(String value) {
        this.importUpdateOption = value;
    }

    /**
     * Gets the value of the peImportOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeImportOption() {
        if (peImportOption == null) {
            return "Merge";
        } else {
            return peImportOption;
        }
    }

    /**
     * Sets the value of the peImportOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeImportOption(String value) {
        this.peImportOption = value;
    }

    /**
     * Gets the value of the analysisFailuresLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisFailuresLimit() {
        if (analysisFailuresLimit == null) {
            return "100";
        } else {
            return analysisFailuresLimit;
        }
    }

    /**
     * Sets the value of the analysisFailuresLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisFailuresLimit(String value) {
        this.analysisFailuresLimit = value;
    }

    /**
     * Gets the value of the deleteAnalysisResultsFileOnError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteAnalysisResultsFileOnError() {
        if (deleteAnalysisResultsFileOnError == null) {
            return "true";
        } else {
            return deleteAnalysisResultsFileOnError;
        }
    }

    /**
     * Sets the value of the deleteAnalysisResultsFileOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteAnalysisResultsFileOnError(String value) {
        this.deleteAnalysisResultsFileOnError = value;
    }

    /**
     * Gets the value of the deleteDestinationFilesOnError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteDestinationFilesOnError() {
        return deleteDestinationFilesOnError;
    }

    /**
     * Sets the value of the deleteDestinationFilesOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteDestinationFilesOnError(String value) {
        this.deleteDestinationFilesOnError = value;
    }

}
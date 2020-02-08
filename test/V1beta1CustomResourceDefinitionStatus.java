/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.16.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
 */
@ApiModel(description = "CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-17T11:16:41.964Z[Etc/UTC]")
public class V1beta1CustomResourceDefinitionStatus {
  public static final String SERIALIZED_NAME_ACCEPTED_NAMES = "acceptedNames";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_NAMES)
  private V1beta1CustomResourceDefinitionNames acceptedNames;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1beta1CustomResourceDefinitionCondition> conditions = null;

  public static final String SERIALIZED_NAME_STORED_VERSIONS = "storedVersions";
  @SerializedName(SERIALIZED_NAME_STORED_VERSIONS)
  private List<String> storedVersions = new ArrayList<String>();


  public V1beta1CustomResourceDefinitionStatus acceptedNames(V1beta1CustomResourceDefinitionNames acceptedNames) {
    
    this.acceptedNames = acceptedNames;
    return this;
  }

   /**
   * Get acceptedNames
   * @return acceptedNames
  **/
  @ApiModelProperty(required = true, value = "")

  public V1beta1CustomResourceDefinitionNames getAcceptedNames() {
    return acceptedNames;
  }


  public void setAcceptedNames(V1beta1CustomResourceDefinitionNames acceptedNames) {
    this.acceptedNames = acceptedNames;
  }


  public V1beta1CustomResourceDefinitionStatus conditions(List<V1beta1CustomResourceDefinitionCondition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public V1beta1CustomResourceDefinitionStatus addConditionsItem(V1beta1CustomResourceDefinitionCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1beta1CustomResourceDefinitionCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * conditions indicate state for particular aspects of a CustomResourceDefinition
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "conditions indicate state for particular aspects of a CustomResourceDefinition")

  public List<V1beta1CustomResourceDefinitionCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1beta1CustomResourceDefinitionCondition> conditions) {
    this.conditions = conditions;
  }


  public V1beta1CustomResourceDefinitionStatus storedVersions(List<String> storedVersions) {
    
    this.storedVersions = storedVersions;
    return this;
  }

  public V1beta1CustomResourceDefinitionStatus addStoredVersionsItem(String storedVersionsItem) {
    this.storedVersions.add(storedVersionsItem);
    return this;
  }

   /**
   * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from &#x60;spec.versions&#x60; while they exist in this list.
   * @return storedVersions
  **/
  @ApiModelProperty(required = true, value = "storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.")

  public List<String> getStoredVersions() {
    return storedVersions;
  }


  public void setStoredVersions(List<String> storedVersions) {
    this.storedVersions = storedVersions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CustomResourceDefinitionStatus v1beta1CustomResourceDefinitionStatus = (V1beta1CustomResourceDefinitionStatus) o;
    return Objects.equals(this.acceptedNames, v1beta1CustomResourceDefinitionStatus.acceptedNames) &&
        Objects.equals(this.conditions, v1beta1CustomResourceDefinitionStatus.conditions) &&
        Objects.equals(this.storedVersions, v1beta1CustomResourceDefinitionStatus.storedVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedNames, conditions, storedVersions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceDefinitionStatus {\n");
    sb.append("    acceptedNames: ").append(toIndentedString(acceptedNames)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    storedVersions: ").append(toIndentedString(storedVersions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


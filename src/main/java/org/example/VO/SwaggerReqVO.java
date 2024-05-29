package org.example.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel("swagger request")
@Data
public class SwaggerReqVO
{
	@ApiModelProperty("id")
	private Integer id;

}

package com.wusi.batis.controller;

import com.wusi.batis.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @ Description   :  图片上传controller
 * @ Author        :  wusi
 * @ CreateDate    :  2019/12/26$ 11:36$
 */
@RestController
@Api(value = "测试图片上传")
public class picUploadController {
    @Value("${upload.picturepath}")
    private String uploadPicturePath;
    @javax.annotation.Resource
    private ResourceLoader resourceLoader;



    @RequestMapping(value = "picupload",method = RequestMethod.POST)
    @ApiOperation(value = "图片上传测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "authorization", value = "加密参数", required = true, dataType = "String", paramType = "header"),
    })
    @ResponseBody
    public Response<String> picUpload(MultipartFile file){
        try {
            file.transferTo(new File(file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Response.ok("成功");
    }

    @ResponseBody
    @RequestMapping("{fileName:.+}")
    public Response<Resource> showPic(String  fileName){
        try {
            return Response.ok(resourceLoader.getResource("file:" + uploadPicturePath + fileName));
        } catch (Exception e) {
        }	return Response.fail("not found");

    }
}

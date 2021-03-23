package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.Comment;
import com.chuangshu.orange.oss.service.AliOssService;
import com.chuangshu.orange.service.CommentService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (Comment)表控制层
 *
 * @author makejava
 * @since 2021-03-21 17:00:02
 */
@RestController
@RequestMapping("comment")
@Api(tags = {"评论"})
public class CommentController {
    /**
     * 服务对象
     */
    @Resource
    private CommentService commentService;
    @Resource
    private AliOssService aliOssService;


    //增加评论
    @ApiOperation(value = "增加一条评论")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "newsId", dataType = "int", required = true, value = "新闻编号"),
            @ApiImplicitParam(paramType = "query", name = "context", dataType = "String", required = true, value = "评论内容"),
            @ApiImplicitParam(paramType = "query", name = "name", dataType = "String", required = true, value = "用户名字"),
            @ApiImplicitParam(paramType = "query", name = "dianzanNum", dataType = "int", required = true, value = "点赞数")

    })
    @PostMapping("insOne")
    public Comment insOne(Integer newsId, String context, String name, @ApiParam(value = "用户头像")MultipartFile touxiangUrl, Integer dianzanNum){
        //上传图片并返回文件路径
        String upload = aliOssService.upload(touxiangUrl);

        Comment comment = new Comment();
        comment.setContext(context);
        comment.setCreateTime(new Date());
        comment.setDianzanNum(dianzanNum);
        comment.setNewsId(newsId);
        comment.setTouxiangUrl(upload);
        comment.setName(name);
        Comment insert = this.commentService.insert(comment);
        return insert;
    }
    //查询指定新闻的所有评论
    @ApiOperation(value = "查询指定新闻的所有评论")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "newsId", dataType = "int", required = true, value = "新闻编号")
    })
    @GetMapping("selOnlyAll")
    public List<Comment> selOnlyAll(Integer newsId){
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        List<Comment> comments = this.commentService.queryAll(comment);
        return comments;
    }

}
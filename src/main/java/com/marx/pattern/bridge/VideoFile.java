package com.marx.pattern.bridge;

/**
 * @version v1.0
 * @ClassName: VideoFile
 * @Description: 视频文件(实现化角色)
 * @Author: Marx
 */
public interface VideoFile {

    //解码功能
    void decode(String fileName);
}

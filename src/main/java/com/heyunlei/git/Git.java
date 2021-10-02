package com.heyunlei.git;

/**
 * @author HeYunLei
 * @date 2021/10/2 - 15:10
 */
public class Git {
    /**
     *  使用口令登录 github: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
     */

    /** git常用命令
     * git config --global user.name 用户名         //设置用户签名
     * git config --global user.email 邮箱          //设置用户邮箱
     * git init                            //初始化本地仓库
     * git status                          //查看本地仓库状态
     * git add 文件名                       //将文件从工作区添加到暂存区
     * git rm --cached 文件名               //将文件从暂存区删除，工作区还在
     * git commit -m "日志信息" 文件名       //提交到本地库
     * git reflog                          //查看历史记录
     * git reset --hard 版本号              //版本穿梭
     */

    /** git分支操作
     * git branch 分支名                    //创建分支
     * git branch -v                       //查看分支
     * git checkout 分支名                  //切换分支
     * git merge 分支名                     //把指定的分支合并到当前分支上
     */

    /** git远程仓库
     * git remote -v                      //查看当前所有远程地址别名
     * git remote add 别名 远程地址         //起别名。 例：git remote add git-demo https://github.com/heyunlei00/git-demo.git
     * git remote rm 别名                  //删除别名。
     *
     * git push 别名(远程地址) 分支         //推送本地库到远程库。 例：git push git-demo master
     * git pull 远程库地址别名 远程分支名    //将远程仓库对于分支最新内容拉下来后与当前本地分支直接合并
     * git clone 远程地址                  //将远程仓库的内容克隆到本地
     */

    /**linux常用命令
     * vim 文件名               //新建（编辑）文件
     * cat 文件名               //查看文件
     * ll                      //显示所有？？？
     */
}

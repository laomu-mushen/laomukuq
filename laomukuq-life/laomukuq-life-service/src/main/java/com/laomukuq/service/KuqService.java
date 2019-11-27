package com.laomukuq.service;

import cc.moecraft.icq.PicqBotX;
import cc.moecraft.icq.PicqConfig;

import com.laomukuq.listeners.TestFilter;
import com.laomukuq.listeners.TestListener;

public class KuqService {
    public static void main(String[] args) {
        // 创建机器人对象 ( 传入配置 )
        PicqBotX bot = new PicqBotX(new PicqConfig(31092).setDebug(true));

        // 添加一个机器人账户 ( 名字, 发送URL, 发送端口 )
        bot.addAccount("Bot01", "127.0.0.1", 31091);

        // 注册事件监听器, 可以注册多个监听器
        bot.getEventManager().registerListeners(
                new TestListener(),
                new TestFilter()
        );


        // 启用指令管理器
        // 这些字符串是指令前缀, 比如指令"!help"的前缀就是"!"
        // bot.enableCommandManager("bot -", "!", "/", "~");

        // 注册指令, 可以注册多个指令
        /*bot.getCommandManager().registerCommands(
                new CommandSay(),
                new CommandTest(),
                new CommandVersion()
        );*/

        // 启动机器人, 不会占用主线程
        bot.startBot();
    }
}
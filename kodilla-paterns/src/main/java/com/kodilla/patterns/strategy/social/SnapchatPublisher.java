package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Generation Z] This post will be shared by Snapchat";
    }
}

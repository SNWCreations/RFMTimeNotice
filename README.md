# RFM-API-Example-Maven

这是一个 RFM API 的示例插件。

此插件的效果是: 当玩家手中有 TNT (数量不考虑) 且 游戏在运行 时，右键会向玩家发送一句话: "Just a example!" 并且不消耗物品。

如果想要消耗物品，让 TNTRightClickProcessor 的 onPlayerUseRequiredItem 方法返回 true 即可。

此示例使用的 RFM API 版本是: 1.5.0 (对应插件的版本 v1.7.x)

-- SNWCreations
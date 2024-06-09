package com.example.vridappassignment.model

data class Meta(
    val footnotes: String,
    val jetpackDontEmailPostToSubs: Boolean, // false
    val jetpackMembershipsContainsPaidContent: Boolean, // false
    val jetpackMembershipsContainsPaywalledContent: Boolean, // false
    val jetpackNewsletterAccess: String,
    val jetpackNewsletterTierId: Int, // 0
    val jetpackPostWasEverPublished: Boolean, // false
    val jetpackPublicizeFeatureEnabled: Boolean, // true
    val jetpackPublicizeMessage: String,
    val jetpackSocialOptions: com.example.vridappassignment.model.JetpackSocialOptions,
    val jetpackSocialPostAlreadyShared: Boolean // true
)
```kotlin
suspend fun fetchLatestBypassRulesFromBackend(): List<BypassRule> {
 return listOf(
 BypassRule(
 allowedUserIds = listOf(
 "EMMYZPABLO.1", // Your admin test account
 "tester-1-id",
 "tester-2-id"
 ),
 allowedIpRanges = listOf("192.168.1.0/24", "your-office-ip/32"),
 expiresAt = System.currentTimeMillis() + 90  24  60  60  1000, // 90 day test window
 enableProxyBypass = true,
 enableRegionBypass = true,
 enableDebugMode = true
 )
 )
}
```

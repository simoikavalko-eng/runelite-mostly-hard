# Mostly Hard – RuneLite Plugin

A RuneLite plugin for the **Mostly Hard** OSRS clan (Hardcore Ironman exclusive).

## Stack
- Java 11, Gradle 8
- RuneLite client API
- OkHttp (HTTP calls), Gson (JSON), Lombok (boilerplate)
- Swing (plugin panel UI)

## How to build
```
./gradlew build
```
Produces a JAR in `build/libs/`. Install it in RuneLite via the Plugin Hub or local plugin loader.

## Key config points (all in one place)

| What | File | Constant / setting |
|---|---|---|
| Clan name | `src/main/java/com/oneshot/utils/Constants.java` | `PLUGIN_NAME`, `CLAN_NAME` |
| Discord invite | `Constants.java` | `LINK_DISCORD`, `LINK_DISCORD_API` |
| Clan logo | `src/main/resources/clanLogo.png` | Replace the file; code auto-loads it |
| Clan About text | `src/main/resources/clan_info.txt` | Edit freely |
| Guestbook backend URL | `Constants.java` | `GUESTBOOK_URL` |
| Discord webhook worker | `Constants.java` | `WORKER_URL` |
| Wise Old Man group | `Constants.java` | URIs containing group ID `13562` |

## New features added
- **About tab** — displays `clan_info.txt`; edit the file to update the in-game panel
- **Book tab** — shared guestbook; set `GUESTBOOK_URL` to a backend endpoint to activate
- **Clan logo slot** — drop your PNG into `src/main/resources/clanLogo.png`

## User preferences
- Keep the existing package structure (`com.oneshot`) unchanged
- Maintain the existing RuneLite plugin architecture

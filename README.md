# BeniCaching (Minecraft 1.8.9)

BeniCaching is a modified version of Moulberry's HUDCaching for Minecraft 1.8.9. It keeps the original HUD framebuffer-caching implementation and adds a OneConfig setting to control how often the cached HUD is refreshed.

## Features

- HUD caching based on the original MCHUDCaching project.
- OneConfig slider: **HUD update rate (per second)**, from **1 to 20**.
- Default: **20 updates per second**, preserving the original once-per-client-tick behaviour.
- The existing `/hudcaching on` and `/hudcaching off` commands remain available.
- Client-side; Minecraft 1.8.9 / Forge.

## Requirements

- Minecraft 1.8.9
- Minecraft Forge 11.15.1.2318
- OneConfig for Minecraft 1.8.9 (Forge), version 0.2.2-alpha228 or compatible

The mod keeps the internal mod ID `hudcaching` so existing integrations and mixin resources continue to use the original identifier. The display name in the mod list and OneConfig is **BeniCaching**.

## PolyPatcher compatibility context

This fork is primarily intended for users of optimization clients such as Silent Client and CM Pack who want to use HUD caching without enabling PolyPatcher's HUD-caching implementation as well. The motivation is based on the author's testing, where PolyPatcher reportedly reduced performance even with its other options disabled and only HUD caching enabled. This is an observed user experience, not a claim that PolyPatcher behaves that way on every system.

If you use PolyPatcher alongside BeniCaching, disable PolyPatcher's HUD caching to avoid running two HUD-caching implementations at the same time.

## Building

Use JDK 8 and the included Gradle wrapper:

```bash
./gradlew build
```

The build uses the original ForgeGradle/Mixin toolchain and resolves the OneConfig 1.8.9 API from Polyfrost's Maven repository.

## Credits and licensing

Original project: **MCHUDCaching by Moulberry**. BeniCaching is a modified fork; the original source attribution and supplied `LICENSE` file are retained. The original license text in the supplied source archive does not clearly identify a specific Creative Commons version in its header, so this repository does not claim a more specific license version than the supplied file establishes. Review `LICENSE` before redistributing.

OneConfig is a separate dependency and remains under its own license.

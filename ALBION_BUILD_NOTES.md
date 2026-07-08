# SlimeTinker2 IE2 + DynaTech + English/Gugu rebuild

Base requested by user: `SlimeTinker2-master.zip` Gugu/Chinese fork.

## Applied changes

- Restored original developer English wording and item lore from the original SlimeTinker source where possible.
- Kept Gugu/Slimefun dependency path in Maven.
- Kept GuizhanLibPlugin updater/check in `SlimeTinker.java`, translated to English.
- Changed old InfinityExpansion runtime hook to `InfinityExpansion2`.
- Updated InfinityExpansion material lookups to IE2 item IDs such as `IE_MAGSTEEL`, `IE_TITANIUM`, `IE_INFINITY_INGOT`, and IE2 singularities.
- Restored DynaTech integration, including `TinkersMaterialsDynatech.java`, DynaTech material IDs, traits, cast items, and registration hooks.
- Added Java 25 GitHub Actions workflow while keeping Maven compiler release at Java 17 for safer runtime compatibility.
- Set plugin metadata to `api-version: 1.20` and version `2.0.2-IE2-26.2-Albion`.

## Build note

Maven is not installed in this sandbox, so this package is source-only. Build it with GitHub Actions or locally using:

```bash
mvn clean package -DskipTests
```

Use the non-`original-...jar` file from `target/`.

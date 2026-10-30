package com.betafy.betafyapp.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Immutable
data class BetafyExtendedColors(
    val success: ColorFamily,
    val warning: ColorFamily,
    val info: ColorFamily,
    val blush: ColorFamily,
)

private val extendedLight = BetafyExtendedColors(
    success = ColorFamily(successLight, onSuccessLight, successContainerLight, onSuccessContainerLight),
    warning = ColorFamily(warningLight, onWarningLight, warningContainerLight, onWarningContainerLight),
    info = ColorFamily(infoLight, onInfoLight, infoContainerLight, onInfoContainerLight),
    blush = ColorFamily(blushLight, onBlushLight, blushContainerLight, onBlushContainerLight),
)

private val extendedLightMediumContrast = BetafyExtendedColors(
    success = ColorFamily(successLightMediumContrast, onSuccessLightMediumContrast, successContainerLightMediumContrast, onSuccessContainerLightMediumContrast),
    warning = ColorFamily(warningLightMediumContrast, onWarningLightMediumContrast, warningContainerLightMediumContrast, onWarningContainerLightMediumContrast),
    info = ColorFamily(infoLightMediumContrast, onInfoLightMediumContrast, infoContainerLightMediumContrast, onInfoContainerLightMediumContrast),
    blush = ColorFamily(blushLightMediumContrast, onBlushLightMediumContrast, blushContainerLightMediumContrast, onBlushContainerLightMediumContrast),
)

private val extendedLightHighContrast = BetafyExtendedColors(
    success = ColorFamily(successLightHighContrast, onSuccessLightHighContrast, successContainerLightHighContrast, onSuccessContainerLightHighContrast),
    warning = ColorFamily(warningLightHighContrast, onWarningLightHighContrast, warningContainerLightHighContrast, onWarningContainerLightHighContrast),
    info = ColorFamily(infoLightHighContrast, onInfoLightHighContrast, infoContainerLightHighContrast, onInfoContainerLightHighContrast),
    blush = ColorFamily(blushLightHighContrast, onBlushLightHighContrast, blushContainerLightHighContrast, onBlushContainerLightHighContrast),
)

private val extendedDark = BetafyExtendedColors(
    success = ColorFamily(successDark, onSuccessDark, successContainerDark, onSuccessContainerDark),
    warning = ColorFamily(warningDark, onWarningDark, warningContainerDark, onWarningContainerDark),
    info = ColorFamily(infoDark, onInfoDark, infoContainerDark, onInfoContainerDark),
    blush = ColorFamily(blushDark, onBlushDark, blushContainerDark, onBlushContainerDark),
)

private val extendedDarkMediumContrast = BetafyExtendedColors(
    success = ColorFamily(successDarkMediumContrast, onSuccessDarkMediumContrast, successContainerDarkMediumContrast, onSuccessContainerDarkMediumContrast),
    warning = ColorFamily(warningDarkMediumContrast, onWarningDarkMediumContrast, warningContainerDarkMediumContrast, onWarningContainerDarkMediumContrast),
    info = ColorFamily(infoDarkMediumContrast, onInfoDarkMediumContrast, infoContainerDarkMediumContrast, onInfoContainerDarkMediumContrast),
    blush = ColorFamily(blushDarkMediumContrast, onBlushDarkMediumContrast, blushContainerDarkMediumContrast, onBlushContainerDarkMediumContrast),
)

private val extendedDarkHighContrast = BetafyExtendedColors(
    success = ColorFamily(successDarkHighContrast, onSuccessDarkHighContrast, successContainerDarkHighContrast, onSuccessContainerDarkHighContrast),
    warning = ColorFamily(warningDarkHighContrast, onWarningDarkHighContrast, warningContainerDarkHighContrast, onWarningContainerDarkHighContrast),
    info = ColorFamily(infoDarkHighContrast, onInfoDarkHighContrast, infoContainerDarkHighContrast, onInfoContainerDarkHighContrast),
    blush = ColorFamily(blushDarkHighContrast, onBlushDarkHighContrast, blushContainerDarkHighContrast, onBlushContainerDarkHighContrast),
)

@Immutable
data class BetafyBrandColors(
    val forest: Color = brandForest,
    val cream: Color = brandCream,
    val night: Color = brandNight,
    val lavender: Color = brandLavender,
    val tangerine: Color = brandTangerine,
    val butter: Color = brandButter,
    val mint: Color = brandMint,
    val blush: Color = brandBlush,
)

enum class BetafyContrast { Standard, Medium, High }

enum class BetafyThemeMode { System, Light, Dark }

@Composable
@ReadOnlyComposable
fun BetafyThemeMode.isDark(): Boolean = when (this) {
    BetafyThemeMode.System -> isSystemInDarkTheme()
    BetafyThemeMode.Light -> false
    BetafyThemeMode.Dark -> true
}

private fun colorSchemeFor(darkTheme: Boolean, contrast: BetafyContrast): ColorScheme = when {
    !darkTheme && contrast == BetafyContrast.Standard -> lightScheme
    !darkTheme && contrast == BetafyContrast.Medium -> mediumContrastLightColorScheme
    !darkTheme -> highContrastLightColorScheme
    contrast == BetafyContrast.Standard -> darkScheme
    contrast == BetafyContrast.Medium -> mediumContrastDarkColorScheme
    else -> highContrastDarkColorScheme
}

private fun extendedColorsFor(darkTheme: Boolean, contrast: BetafyContrast): BetafyExtendedColors = when {
    !darkTheme && contrast == BetafyContrast.Standard -> extendedLight
    !darkTheme && contrast == BetafyContrast.Medium -> extendedLightMediumContrast
    !darkTheme -> extendedLightHighContrast
    contrast == BetafyContrast.Standard -> extendedDark
    contrast == BetafyContrast.Medium -> extendedDarkMediumContrast
    else -> extendedDarkHighContrast
}

val BetafyShapes = Shapes(
    extraSmall = RoundedCornerShape(8.dp),
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(24.dp),
    extraLarge = RoundedCornerShape(32.dp),
)

object BetafySpacing {
    val xxs: Dp = 4.dp
    val xs: Dp = 8.dp
    val sm: Dp = 12.dp
    val md: Dp = 16.dp
    val lg: Dp = 24.dp
    val xl: Dp = 32.dp
    val xxl: Dp = 48.dp
    val screenHorizontal: Dp = 20.dp
}

object BetafySizes {
    val minTouchTarget: Dp = 48.dp
    val buttonHeight: Dp = 56.dp
    val buttonHeightCompact: Dp = 40.dp
    val textFieldHeight: Dp = 56.dp
    val icon: Dp = 24.dp
    val iconSmall: Dp = 20.dp
    val navigationBarHeight: Dp = 76.dp
    val avatarSmall: Dp = 40.dp
    val avatarMedium: Dp = 56.dp
    val avatarLarge: Dp = 96.dp
    val borderThin: Dp = 1.dp
    val borderStrong: Dp = 2.dp
}

private val LocalBetafyExtendedColors = staticCompositionLocalOf { extendedLight }
private val LocalBetafyBrandColors = staticCompositionLocalOf { BetafyBrandColors() }
private val LocalBetafyReadingTypography = staticCompositionLocalOf { DefaultReadingTypography }

val MaterialTheme.extendedColors: BetafyExtendedColors
    @Composable
    @ReadOnlyComposable
    get() = LocalBetafyExtendedColors.current

val MaterialTheme.readingTypography: BetafyReadingTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalBetafyReadingTypography.current

val MaterialTheme.brandColors: BetafyBrandColors
    @Composable
    @ReadOnlyComposable
    get() = LocalBetafyBrandColors.current

@Composable
fun BetafyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    contrast: BetafyContrast = BetafyContrast.Standard,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        else -> colorSchemeFor(darkTheme, contrast)
    }

    CompositionLocalProvider(
        LocalBetafyExtendedColors provides extendedColorsFor(darkTheme, contrast),
        LocalBetafyBrandColors provides BetafyBrandColors(),
        LocalBetafyReadingTypography provides DefaultReadingTypography,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = BetafyTypography,
            shapes = BetafyShapes,
            content = content
        )
    }
}

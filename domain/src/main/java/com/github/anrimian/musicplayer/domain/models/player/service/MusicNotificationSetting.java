package com.github.anrimian.musicplayer.domain.models.player.service;

public class MusicNotificationSetting {
    private final boolean showCovers;
    private final boolean coloredNotification;
    private final boolean showNotificationCoverStub;
    private final boolean coversOnLockScreen;

    public MusicNotificationSetting(boolean showCovers,
                                    boolean coloredNotification,
                                    boolean showNotificationCoverStub,
                                    boolean coversOnLockScreen) {
        this.showCovers = showCovers;
        this.coloredNotification = coloredNotification;
        this.showNotificationCoverStub = showNotificationCoverStub;
        this.coversOnLockScreen = coversOnLockScreen;
    }

    public boolean isShowCovers() {
        return showCovers;
    }

    public boolean isColoredNotification() {
        return coloredNotification;
    }

    public boolean isCoversOnLockScreen() {
        return coversOnLockScreen;
    }

    public boolean isShowNotificationCoverStub() {
        return showNotificationCoverStub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicNotificationSetting that = (MusicNotificationSetting) o;

        if (showCovers != that.showCovers) return false;
        if (coloredNotification != that.coloredNotification) return false;
        if (showNotificationCoverStub != that.showNotificationCoverStub) return false;
        return coversOnLockScreen == that.coversOnLockScreen;
    }

    @Override
    public int hashCode() {
        int result = (showCovers ? 1 : 0);
        result = 31 * result + (coloredNotification ? 1 : 0);
        result = 31 * result + (showNotificationCoverStub ? 1 : 0);
        result = 31 * result + (coversOnLockScreen ? 1 : 0);
        return result;
    }
}

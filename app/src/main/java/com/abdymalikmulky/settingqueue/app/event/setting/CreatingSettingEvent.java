package com.abdymalikmulky.settingqueue.app.event.setting;

import com.abdymalikmulky.settingqueue.app.data.setting.Setting;

/**
 * Created by efishery on 04/05/17.
 */

public class CreatingSettingEvent {
    private Setting setting;

    public CreatingSettingEvent(Setting setting) {
        this.setting = setting;
    }

    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }
}
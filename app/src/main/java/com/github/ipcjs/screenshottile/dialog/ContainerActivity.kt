package com.github.ipcjs.screenshottile.dialog

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

/**
 * Created by ipcjs on 2017/8/17.
 */

class ContainerActivity : TransparentContainerActivity() {
    companion object {
        /**
         * Start activity
         */
        fun start(ctx: Context, fragmentClass: Class<out Fragment>, args: Bundle? = null) {
            ctx.startActivity(newIntent(ctx, ContainerActivity::class.java, fragmentClass, args))
        }
    }
}

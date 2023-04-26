package my.newapp.fsm.gpstracker.utils

import android.app.AlertDialog
import android.content.Context
import my.newapp.fsm.gpstracker.R

object DialogManager {
    fun showLocEnableDialog(context: Context, listener: Listener) {
        val builder = AlertDialog.Builder(context)
        val dialog = builder.create()
        dialog.setTitle(R.string.location_disabled)
        dialog.setMessage(context.getString(R.string.dialog_message))
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, context.getString(R.string.yes)) {
                _, _ -> listener.onClick()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, context.getString(R.string.no)) {
                _, _ -> dialog.dismiss()
        }
        dialog.show()
    }

    interface Listener {
        fun onClick()
    }
}
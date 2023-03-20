package com.arash.altafi.views.kotlin.dialog1

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.method.PasswordTransformationMethod
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.afollestad.materialdialogs.*
import com.afollestad.materialdialogs.bottomsheets.BasicGridItem
import com.afollestad.materialdialogs.bottomsheets.BottomSheet
import com.afollestad.materialdialogs.bottomsheets.gridItems
import com.afollestad.materialdialogs.callbacks.onCancel
import com.afollestad.materialdialogs.callbacks.onDismiss
import com.afollestad.materialdialogs.callbacks.onShow
import com.afollestad.materialdialogs.checkbox.checkBoxPrompt
import com.afollestad.materialdialogs.color.ColorPalette
import com.afollestad.materialdialogs.color.colorChooser
import com.afollestad.materialdialogs.customview.customView
import com.afollestad.materialdialogs.customview.getCustomView
import com.afollestad.materialdialogs.datetime.datePicker
import com.afollestad.materialdialogs.datetime.dateTimePicker
import com.afollestad.materialdialogs.datetime.timePicker
import com.afollestad.materialdialogs.files.fileChooser
import com.afollestad.materialdialogs.files.folderChooser
import com.afollestad.materialdialogs.input.input
import com.afollestad.materialdialogs.lifecycle.lifecycleOwner
import com.afollestad.materialdialogs.list.listItems
import com.afollestad.materialdialogs.list.listItemsMultiChoice
import com.afollestad.materialdialogs.list.listItemsSingleChoice
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_dialog_kotlin1.*

class DialogKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_kotlin1)
        
        init()
    }
    
    @SuppressLint("CheckResult")
    private fun init() {

        basic.setOnClickListener {
            MaterialDialog(this).show {
                message(R.string.shareLocationPrompt)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        basic_titled.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.useGoogleLocationServicesPrompt)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        basic_buttons.setOnClickListener {
            MaterialDialog(this).show {
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(R.string.agree , null , object : DialogCallback {
                    override fun invoke(p1: MaterialDialog) {
                        Toast.makeText(this@DialogKotlinActivity1 , "positive clicked" , Toast.LENGTH_SHORT).show()
                    }
                })
                negativeButton(R.string.disagree , null , object : DialogCallback {
                    override fun invoke(p1: MaterialDialog) {
                        Toast.makeText(this@DialogKotlinActivity1 , "negative clicked" , Toast.LENGTH_SHORT).show()
                    }
                })
                cancelable  //  !cancelable
                lifecycleOwner(this@DialogKotlinActivity1)
                    .setOnCancelListener {
                        Toast.makeText(this@DialogKotlinActivity1 , "canceled" , Toast.LENGTH_SHORT).show()
                    }
            }
        }

        /////////////////////////////////////////////////////

        basic_stacked_buttons.setOnClickListener {
            MaterialDialog(this).show {
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(text = "This is a long button")
                negativeButton(text = "So is this, these should stack")
                cancelable  //  !cancelable
            }
        }

        /////////////////////////////////////////////////////

        basic_titled_buttons.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        basic_html_content.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.app_name)
                message(R.string.htmlContent) {
                    html { Toast.makeText(this@DialogKotlinActivity1 , "Clicked link: $it" , Toast.LENGTH_SHORT).show() }
                    lineSpacing(1.4f)
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        basic_long_titled_buttons.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.loremIpsum)
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        basic_icon.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                icon(R.drawable.view_ir)
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        basic_checkbox_titled_buttons.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                checkBoxPrompt(R.string.checkboxConfirm) { checked ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Checked? $checked" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        list.setOnClickListener {
            MaterialDialog(this).show {
                listItems(R.array.socialNetworks) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "$text at index $index" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        list_buttons.setOnClickListener {
            MaterialDialog(this).show {
                listItems(R.array.socialNetworks) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        list_dont_wait_positive.setOnClickListener {
            MaterialDialog(this).show {
                listItems(R.array.socialNetworks, waitForPositiveButton = false) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                negativeButton(android.R.string.cancel)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        list_titled.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItems(R.array.socialNetworks) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        list_titled_buttons.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItems(R.array.socialNetworks) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        list_titled_message_buttons.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                message(R.string.useGoogleLocationServices)
                listItems(R.array.socialNetworks) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        list_long.setOnClickListener {
            MaterialDialog(this).show {
                listItems(R.array.states) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        list_long_titled.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.states)
                listItems(R.array.states) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        list_checkPrompt_buttons.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItems(R.array.socialNetworks_longItems) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                checkBoxPrompt(R.string.checkboxConfirm) { checked ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Checked? $checked" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        single_choice_titled.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItemsSingleChoice(R.array.socialNetworks, initialSelection = 1) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        single_choice_buttons_titled.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItemsSingleChoice(R.array.socialNetworks, initialSelection = 2) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.choose)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        single_choice_long_items.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItemsSingleChoice(R.array.socialNetworks_longItems) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.choose)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        single_choice_disabled_items.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItemsSingleChoice(
                    R.array.socialNetworks, initialSelection = 1, disabledIndices = intArrayOf(1, 3)) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.choose)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        single_choice_custom_radio_color.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItemsSingleChoice(R.array.socialNetworks, initialSelection = 1, checkedColor = Color.RED, uncheckedColor = Color.CYAN) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.choose)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        multiple_choice.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItemsMultiChoice(R.array.socialNetworks, initialSelection = intArrayOf(1, 3)) { _, indices, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected items ${text.joinToString()} at indices ${indices.joinToString()}" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        multiple_choice_buttons.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItemsMultiChoice(R.array.socialNetworks, initialSelection = intArrayOf(1, 3)) { _, indices, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected items ${text.joinToString()} at indices ${indices.joinToString()}" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.choose)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        multiple_choice_long_items.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItemsMultiChoice(R.array.socialNetworks_longItems, initialSelection = intArrayOf(0, 2)) { _, indices, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected items ${text.joinToString()} at indices ${indices.joinToString()}" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.choose)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        multiple_choice_disabled_items.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.socialNetworks)
                listItemsMultiChoice(R.array.socialNetworks, initialSelection = intArrayOf(2, 3), disabledIndices = intArrayOf(1, 3)) { _, indices, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected items ${text.joinToString()} at indices ${indices.joinToString()}" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.choose)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        buttons_stacked.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(text = "Hello World")
                negativeButton(text = "How are you doing?")
                neutralButton(text = "Testing long buttons")
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        buttons_stacked_checkboxPrompt.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(text = "Hello World")
                negativeButton(text = "How are you doing?")
                neutralButton(text = "Testing long buttons")
                checkBoxPrompt(R.string.checkboxConfirm) { checked ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Checked? $checked" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        buttons_neutral.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                neutralButton(R.string.more_info)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        buttons_callbacks.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(R.string.agree) {
                    Toast.makeText(this@DialogKotlinActivity1 , "On positive" , Toast.LENGTH_SHORT).show()
                }
                negativeButton(R.string.disagree) {
                    Toast.makeText(this@DialogKotlinActivity1 , "On negative" , Toast.LENGTH_SHORT).show()
                }
                neutralButton(R.string.more_info) {
                    Toast.makeText(this@DialogKotlinActivity1 , "On neutral" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        misc_dialog_callbacks.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                onShow {
                    Toast.makeText(this@DialogKotlinActivity1 , "onPreShow" , Toast.LENGTH_SHORT).show()
                }
                onCancel {
                    Toast.makeText(this@DialogKotlinActivity1 , "onCancel" , Toast.LENGTH_SHORT).show()
                }
                onDismiss {
                    Toast.makeText(this@DialogKotlinActivity1 , "onDismiss" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        input.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                input(hint = "Type something", inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_WORDS) { _, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Input: $text" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
            }
        }

        /////////////////////////////////////////////////////

        input_message.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.useGoogleLocationServicesPrompt)
                input(hint = "Type something", prefill = "Pre-filled!", inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_WORDS) { _, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Input: $text" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        input_counter.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                input(hint = "Type something", inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_WORDS, maxLength = 8) { _, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Input: $text" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        input_check_prompt.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.useGoogleLocationServices)
                input(hint = "Type something", inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_WORDS) { _, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Input: $text" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                checkBoxPrompt(R.string.checkboxConfirm) { checked ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Checked? $checked" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        custom_view.setOnClickListener {
//            showCustomViewDialog()
        }

        /////////////////////////////////////////////////////

        custom_view_webview.setOnClickListener {
//            showWebViewDialog()
        }

        /////////////////////////////////////////////////////

        colorChooser_primary.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.primary_colors)
                colorChooser(ColorPalette.Primary, ColorPalette.PrimarySub) { _, color ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected color: ${color}" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.select)
                negativeButton(android.R.string.cancel)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        colorChooser_accent.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.accent_colors)
                colorChooser(ColorPalette.Accent, ColorPalette.AccentSub) { _, color ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected color: ${color}" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.select)
                negativeButton(android.R.string.cancel)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        colorChooser_customColors.setOnClickListener {
            val topLevel = intArrayOf(Color.TRANSPARENT, Color.RED, Color.YELLOW, Color.BLUE)
            val subLevel = arrayOf(
                intArrayOf(Color.WHITE, Color.TRANSPARENT, Color.BLACK),
                intArrayOf(Color.LTGRAY, Color.GRAY, Color.DKGRAY),
                intArrayOf(Color.GREEN),
                intArrayOf(Color.MAGENTA, Color.CYAN)
            )
            MaterialDialog(this).show {
                title(R.string.custom_colors)
                colorChooser(topLevel, subLevel) { _, color ->
                    val colorStr = if (color == Color.TRANSPARENT) "transparent" else color
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected color: $colorStr" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.select)
                negativeButton(android.R.string.cancel)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        colorChooser_customColorsNoSub.setOnClickListener {
            val topLevel = intArrayOf(Color.RED, Color.YELLOW, Color.BLUE)

            MaterialDialog(this).show {
                title(R.string.custom_colors)
                colorChooser(topLevel) { _, color ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected color: $color" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.select)
                negativeButton(android.R.string.cancel)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        colorChooser_primary_customRgb.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.custom_colors_rgb)
                colorChooser(
                    colors = ColorPalette.Primary,
                    subColors = ColorPalette.PrimarySub,
                    allowCustomArgb = true) { _, color ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected color: $color" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.select)
                negativeButton(android.R.string.cancel)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        colorChooser_primary_customArgb.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.custom_colors_argb)
                colorChooser(
                    colors = ColorPalette.Primary,
                    subColors = ColorPalette.PrimarySub,
                    allowCustomArgb = true,
                    showAlphaSelector = true) { _, color ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected color: $color" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.select)
                negativeButton(android.R.string.cancel)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        file_chooser.setOnClickListener {
//            showFileChooser()
        }

        /////////////////////////////////////////////////////

        file_chooser_buttons.setOnClickListener {
//            showFileChooserButtons()
        }

        /////////////////////////////////////////////////////

        file_chooser_filter.setOnClickListener {
//            showFileChooserFilter()
        }

        /////////////////////////////////////////////////////

        folder_chooser_buttons.setOnClickListener {
//            showFolderChooserButtons()
        }

        /////////////////////////////////////////////////////

        folder_chooser_filter.setOnClickListener {
//            showFolderChooserFilter()
        }

        /////////////////////////////////////////////////////

        date_picker.setOnClickListener {
            MaterialDialog(this).show {
                datePicker { _, date ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected date: $date" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        time_picker.setOnClickListener {
            MaterialDialog(this).show {
                title(text = "Select Time")
                timePicker { _, time ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected time: $time" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        datetime_picker.setOnClickListener {
            MaterialDialog(this).show {
                title(text = "Select Date and Time")
                dateTimePicker(requireFutureDateTime = true) { _, dateTime ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected date/time: $dateTime" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        bottomsheet_info.setOnClickListener {
            MaterialDialog(this, BottomSheet(LayoutMode.WRAP_CONTENT)).show {
                title(R.string.useGoogleLocationServices)
                message(R.string.useGoogleLocationServicesPrompt)
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        bottomsheet_list.setOnClickListener {
            MaterialDialog(this, BottomSheet(LayoutMode.WRAP_CONTENT)).show {
                listItems(R.array.states) { _, index, text ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item $text at index $index" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        bottomsheet_grid.setOnClickListener {
            val items = listOf(
                BasicGridItem(R.drawable.ic_icon_android, "One"),
                BasicGridItem(R.drawable.ic_icon_android, "Two"),
                BasicGridItem(R.drawable.ic_icon_android, "Three"),
                BasicGridItem(R.drawable.ic_icon_android, "Four"),
                BasicGridItem(R.drawable.ic_icon_android, "Five"),
                BasicGridItem(R.drawable.ic_icon_android, "Six"),
                BasicGridItem(R.drawable.ic_icon_android, "Seven"),
                BasicGridItem(R.drawable.ic_icon_android, "Eight")
            )

            MaterialDialog(this, BottomSheet(LayoutMode.WRAP_CONTENT)).show {
                gridItems(items) { _, index, item ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected item ${item.title} at index $index" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.agree)
                negativeButton(R.string.disagree)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        bottomsheet_customView.setOnClickListener {
//            showCustomViewDialog(BottomSheet(LayoutMode.WRAP_CONTENT))
        }

        /////////////////////////////////////////////////////

        bottomsheet_colorPicker.setOnClickListener {
            MaterialDialog(this, BottomSheet(LayoutMode.WRAP_CONTENT)).show {
                title(R.string.custom_colors_argb)
                colorChooser(
                    colors = ColorPalette.Primary,
                    subColors = ColorPalette.PrimarySub,
                    allowCustomArgb = true,
                    showAlphaSelector = true) { _, color ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected color: $color" , Toast.LENGTH_SHORT).show()
                }
                positiveButton(R.string.select)
                negativeButton(android.R.string.cancel)
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

        /////////////////////////////////////////////////////

        bottomsheet_dateTimePicker.setOnClickListener {
            MaterialDialog(this, BottomSheet(LayoutMode.WRAP_CONTENT)).show {
                title(text = "Select Date and Time")
                dateTimePicker(requireFutureDateTime = true) { _, dateTime ->
                    Toast.makeText(this@DialogKotlinActivity1 , "Selected date/time: $dateTime" , Toast.LENGTH_SHORT).show()
                }
                lifecycleOwner(this@DialogKotlinActivity1)
            }
        }

    }
    
}
package pe.com.bootcamp.disenioconstraintlayout.util

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.view_title_description.view.*
import pe.com.bootcamp.disenioconstraintlayout.R


class TitleDescriptionView(context: Context, attrs: AttributeSet? = null) : LinearLayout(context, attrs) {

    init {


        inflate(context, R.layout.view_title_description, this)

        attrs?.let {

            val attributes = context.obtainStyledAttributes(attrs, R.styleable.TitleDescriptionView)
            tviTitle.text = attributes.getString(R.styleable.TitleDescriptionView_title)
            tviDescription.text = attributes.getString(R.styleable.TitleDescriptionView_description)


            attributes.recycle()
        }


    }


    fun initializeUI(
            title: String,
            description: String
    ) {

        tviTitle.text = title
        tviDescription.text = description


    }


}
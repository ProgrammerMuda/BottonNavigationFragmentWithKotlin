package izzi.go.fragmentkotlin

import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class HomeFrag : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home, container, false)
    }

    companion object{
        fun newInstance(): HomeFrag{
            val fragment = HomeFrag()
            val args = Bundle()
            fragment.arguments = args
            return  fragment
        }
    }

}
package com.bharathkalyans.dsalgovisualizer.trees

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.R
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityBinarytreeBinding/*
import de.blox.treeview.BaseTreeAdapter
import de.blox.treeview.TreeNode*/
import java.util.*

class Binarytree : AppCompatActivity() {

    private lateinit var btreebinding: ActivityBinarytreeBinding

    /*private var root: TreeNode? = null
    private val queue: Queue<TreeNode> = LinkedList()
    private val set: HashSet<String> = HashSet()*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btreebinding = ActivityBinarytreeBinding.inflate(layoutInflater)

        /*val adapter: BaseTreeAdapter<TreeNodeViewHolder?> =
            object : BaseTreeAdapter<TreeNodeViewHolder?>(this, R.layout.tree_node) {

                override fun onCreateViewHolder(view: View): TreeNodeViewHolder {
                    return TreeNodeViewHolder(view)
                }

                override fun onBindViewHolder(
                    viewHolder: TreeNodeViewHolder?, data: Any?, position: Int
                ) {
                    viewHolder?.tv?.text = data.toString()
                    // viewHolder.mTextView.setText(data.toString())

                }
            }*/


        //Tree Adapter!
/*
        btreebinding.binaryTreeView.adapter = adapter
*/


       /* btreebinding.btnBTAdd.setOnClickListener {
            val value = btreebinding.etTreeValue.text.toString()

            if (value == "") {
                Toast.makeText(applicationContext, "Please Enter a value", Toast.LENGTH_SHORT)
                    .show()
            }
            if (set.contains(value)) {
                Toast.makeText(applicationContext, "No Duplicates Allowed", Toast.LENGTH_SHORT)
                    .show()
            }

            set.add(value)
            addToTree(value, root)
            root?.let { it1 -> adapter.setRootNode(it1) }
        }

        setContentView(btreebinding.root)

    }

    private fun addToTree(value: String, root: TreeNode?) {

        if (root == null) {
            this.root = TreeNode(value)
            return
        }
        val temp = root
        queue.add(temp)

        while (!queue.isEmpty()) {
            val t: TreeNode? = queue.peek()
            val treeNodes = t?.children as ArrayList<TreeNode>

            if (treeNodes.size == 2) {
                queue.poll()
                queue.add(treeNodes[0])
                queue.add(treeNodes[1])
            } else {
                t.addChild(TreeNode(value))
                break
            }
        }*/
    }
}
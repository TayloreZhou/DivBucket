/*
 * Copyright 2016 - 2017 ShineM (Xinyuan)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under.
 */

package com.tj007.divbucketmvp.components.treeview.base;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.tj007.divbucketmvp.components.treeview.TreeNode;
import com.tj007.divbucketmvp.components.treeview.TreeView;



public abstract class BaseNodeViewBinder extends RecyclerView.ViewHolder {
    /**
     * This reference of TreeView make BaseNodeViewBinder has the ability
     * to expand node or select node.
     */
    protected TreeView treeView;

    public BaseNodeViewBinder(View itemView) {
        super(itemView);
    }

    public void setTreeView(TreeView treeView) {
        this.treeView = treeView;
    }

    /**
     * Get node item layout id
     */
    public abstract int getLayoutId();

    /**
     * Bind your data to view,you can get the data from treeNode by getValue()
     *
     * @param treeNode Node data
     */
    public abstract void bindView(TreeNode treeNode);

    /**
     * if you do not want toggle the node when click whole item view,then you can assign a view to
     * trigger the toggle action
     *
     * @return The assigned view id to trigger expand or collapse.
     */
    public int getToggleTriggerViewId() {
        return 0;
    }

    /**
     * Callback when a toggle action happened (only by clicked)
     *
     * @param treeNode The toggled node
     * @param expand   Expanded or collapsed
     */
    public void onNodeToggled(TreeNode treeNode, boolean expand) {
        //empty
    }
}

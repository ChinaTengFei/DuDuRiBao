package com.example.george.dudu;

import android.support.v7.util.DiffUtil;
import android.support.v7.util.ListUpdateCallback;
import android.util.Log;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private static final String TAG = "ExampleUnitTest";
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    @Test
    public void addition_isCorrect() throws Exception {

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }

        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new DiffUtil.Callback() {
            @Override
            public int getOldListSize() {
                return list.size();
            }

            @Override
            public int getNewListSize() {
                return list2.size();
            }

            @Override
            public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                return list.get(oldItemPosition).equals(list.get(newItemPosition));
            }

            @Override
            public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                return false;
            }
        });
        diffResult.dispatchUpdatesTo(new ListUpdateCallback() {
            @Override
            public void onInserted(int position, int count) {
                System.out.println("onInserted() called with: position = [" + position + "], count = [" + count + "]");
            }

            @Override
            public void onRemoved(int position, int count) {
                System.out.println("onRemoved() called with: position = [" + position + "], count = [" + count + "]");
            }

            @Override
            public void onMoved(int fromPosition, int toPosition) {
                System.out.println("onMoved() called with: fromPosition = [" + fromPosition + "], toPosition = [" + toPosition + "]");
            }

            @Override
            public void onChanged(int position, int count, Object payload) {
                System.out.println("onChanged() called with: position = [" + position + "], count = [" + count + "], payload = [" + payload + "]");
            }
        });
    }
}
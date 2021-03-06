package com.cps731lab5.dummy;

import com.cps731lab5.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class DummyContent {

    /* An array of sample (dummy) items.*/
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /* A map of sample (dummy) items, by ID.*/
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.recipeStr, item);
    }

    static {
        //Add recipes
        addItem(new DummyItem("Chicken Cordon Bleu", "Chicken filled with ham and swiss cheese, topped with bread crumbs.",
                "Ingredients:\n\nchicken\nsalt\npepper\nswiss cheese\nham\nbread crumbs", R.drawable.img1));
        addItem(new DummyItem("Tuna Casserole", "Macaroni with tuna in cream of chicken soup sauce with cheese and fried onions.",
                "Ingredients:\n\nmacaroni\ntuna\ncream of chicken soup\ncheddar cheese\nfriend onions", R.drawable.img2));
        addItem(new DummyItem("Ground Beef Noodles", "Ramen noodles topped with ground beef, tomato, and corn.",
                "Ingredients:\n\nground beef\nramen noodles\ndiced tomatoes\ncorn", R.drawable.img3));
        addItem(new DummyItem("Smoked Cheese Ravioli", "Creamy cheese ravioli with smoked gouda.",
                "Ingredients:\n\nfrozen ravioli\ncream\nGouda cheese\nfresh parsley\npepper", R.drawable.img4));
        addItem(new DummyItem("Pesto Chicken", "Chicken breast topped with basil pesto and prosciutto.",
                "Ingredients:\n\nchicken breast\nbasil pesto\nprosciutto", R.drawable.img5));
        addItem(new DummyItem("Roasted Butternut Squash", "Butternut squash baked with olive oil, salt, and pepper.",
                "Ingredients:\n\nbutternut squash\nolive oil\npepper\nsalt\npepper", R.drawable.img6));
        addItem(new DummyItem("Miso-Glazed Turnips", "Charred turnips coated in miso, butter, sugar, pepper, and lemon.",
                "Ingredients:\n\nturnips\nmiso\nbutter\nsugar\npepper\nlemon", R.drawable.img7));
        addItem(new DummyItem("Charred Leeks With Honey and Vinegar", "Leeks glazed in vinegar, honey, and olive oil.",
                "Ingredients:\n\nleeks\nvinegar\nhoney\nolive oil", R.drawable.img8));
        addItem(new DummyItem("Collard Greens", "Sauteed collard greens, bacon, and onions seasoned with chili and salt.",
                "Ingredients:\n\nonion\nolive oil\nbacon\npepper\ncollard greens\nchili\nsalt", R.drawable.img9));
        addItem(new DummyItem("Jammy Eggs with Paprika Aioli", "Soft boiled eggs topped with pepperoncini, parsley, mayonnaise, paprika, and salt.",
                "Ingredients:\n\neggs\npepperoncini\nparsley\nmayonnaise\npaprika\nsalt", R.drawable.img10));
        addItem(new DummyItem("Pasta al Limone", "Spaghetti with butter cream sauce spiced topped with salt, pepper, and lemon.",
                "Ingredients:\n\nspaghetti\nlemon\nsalt\ncream\nbutter\ncheese\npepper", R.drawable.img11));
    }

    /* A dummy item representing a piece of content. */
    public static class DummyItem {
        public final String recipeStr;
        public final String descriptionStr;
        public final String ingredientsStr;
        public final int image;

        public DummyItem(String recipeStr, String descriptionStr, String ingredientsStr, int image) {
            this.recipeStr = recipeStr;
            this.descriptionStr = descriptionStr;
            this.ingredientsStr = ingredientsStr;
            this.image = image;
        }

        @Override
        public String toString() {
            return ingredientsStr;
        }
    }
}
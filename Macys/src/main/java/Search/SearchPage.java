package Search;

import base.CommonAPI;

public class SearchPage extends CommonAPI {

    public void searchMenu(){

        typeOnElementEntry("#globalSearchInputField", "Perfumes");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Dresses");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Watches");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Adidas");
        navigateBack();
    }
}

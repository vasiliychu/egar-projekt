package com.controller.au;

import com.model.au.LotModel;
import com.view.au.LotView;

import java.util.List;

public class LotController {

        private LotModel model;
        private LotView view;

        public LotController(LotModel model, LotView view) {
            this.model = model;
            this.view = view;
        }

        public void setTypeLot(List typeLot) { model.setTypeLot(typeLot); }
        public List getTypeLot() {return model.getTypeLot();}


        public void updateView() { view.printLotInfo(model.getTypeLot()); }


}

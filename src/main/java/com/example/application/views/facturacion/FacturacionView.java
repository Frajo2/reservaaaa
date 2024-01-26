package com.example.application.views.facturacion;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Facturacion")
@Route(value = "my-view2", layout = MainLayout.class)
@Uses(Icon.class)
public class FacturacionView extends Composite<VerticalLayout> {

    public FacturacionView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}

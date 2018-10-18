import { Component } from "@angular/core";
import { Model, TodoItem } from "./model";

@Component({
    selector: "AngDlr-app",
    templateUrl: "app.component.html"
})
export class AppComponent {
    model = new Model();
    getName() {
        return this.model.user;
    }
    getTodoItems() {
        return this.model.items.filter(item => !item.stock);
    }
    addItem(newItem) {
        if (newItem != "") {
            this.model.items.push(new TodoItem(newItem, "sometext", false));
        }
    }
}
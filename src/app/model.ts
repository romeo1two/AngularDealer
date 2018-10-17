export class Model {
    user;
    items;
    constructor() {
        this.user = "AngularDealer";
        this.items = [new TodoItem("Ford", "Explorer", false),
                      new TodoItem("Chevrolet", "Silverado", false),
                      new TodoItem("GMC", "Sierra", false),
                      new TodoItem("Ford", "Fusion", false)]
    }
}
export class TodoItem {
    make;
    model;
    stock;
    constructor(make, model, stock) {
        this.make = make;
        this.model = model;
        this.stock = stock;
    }
}
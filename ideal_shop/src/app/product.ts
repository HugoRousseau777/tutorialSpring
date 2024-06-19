import { Pm } from "./pm";
import { Pmin } from "./pmin";
import { Pv } from "./pv";

export class Product {
    id!: number;
    name!: string;
    price!: number;
    img!: string;
    pm!: Pm;
    pmin!: Pmin;
    pv!: Pv;
    constructor() {
        // No assignment or initialization needed
        
        }
}

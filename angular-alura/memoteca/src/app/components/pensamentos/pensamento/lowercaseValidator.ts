import {AbstractControl} from "@angular/forms";

export function lowercaseValidator(control: AbstractControl) {
  const autoria = control.value as string;
  return autoria !== autoria?.toLowerCase() ? {'lowerCase': true} : null;
}

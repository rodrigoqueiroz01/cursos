import {AbstractControl} from "@angular/forms";

export function lowercaseValidator(control: AbstractControl) {
  const autoria = control.value as string;

  if (autoria !== autoria?.toLowerCase()) {
    return {'lowerCase': true};
  } else {
    return null;
  }
}

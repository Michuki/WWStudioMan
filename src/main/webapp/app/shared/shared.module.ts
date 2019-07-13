import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { StudioManSharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [StudioManSharedCommonModule],
  declarations: [HasAnyAuthorityDirective],
  exports: [StudioManSharedCommonModule, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class StudioManSharedModule {
  static forRoot() {
    return {
      ngModule: StudioManSharedModule
    };
  }
}

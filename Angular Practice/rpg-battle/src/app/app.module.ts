import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BattlersComponent } from './components/battlers/battlers.component';
import { AlliesComponent } from './components/allies/allies.component';
import { EnemiesComponent } from './components/enemies/enemies.component';

@NgModule({
  declarations: [
    AppComponent,
    BattlersComponent,
    AlliesComponent,
    EnemiesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

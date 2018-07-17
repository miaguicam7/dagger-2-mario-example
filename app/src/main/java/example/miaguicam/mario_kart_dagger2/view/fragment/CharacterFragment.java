/*
 * Copyright (C) 2017 Erik Jhordan Rey.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package example.miaguicam.mario_kart_dagger2.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.miaguicam.mario_kart_dagger2.R;

import butterknife.BindView;
import example.miaguicam.mario_kart_dagger2.adapter.CharacterAdapter;
import example.miaguicam.mario_kart_dagger2.model.Character;

public class CharacterFragment extends BaseFragment {

    public static final String EXTRA_CHARACTER_POSITION = "character_position";
    public static final String EXTRA_CHARACTER = "character";

    public static CharacterFragment newInstance(Character character) {
        CharacterFragment characterFragment = new CharacterFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(EXTRA_CHARACTER, character);
        characterFragment.setArguments(bundle);
        return characterFragment;
    }

    @BindView(R.id.button_name)
    Button nameButton;
    @BindView(R.id.image_profile)
    ImageView profileImage;

    @BindView(R.id.cardView)
    CardView cardView;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_character;
    }

    @Override
    protected void onPrepareFragment(@NonNull View view) {
        super.onPrepareFragment(view);
        final Character character = getCharacter();
        renderCharacter(character);
    }

    private void renderCharacter(final Character character) {
        nameButton.setText(character.name());
        profileImage.setImageResource(character.photo());
        cardView.setMaxCardElevation(cardView.getCardElevation() * CharacterAdapter.MAX_ELEVATION);
        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt(character.id()) - 1;
            }
        });
    }

    private Character getCharacter() {
        return (Character) getArguments().getSerializable(EXTRA_CHARACTER);
    }

    public CardView getCardView() {
        return cardView;
    }
}

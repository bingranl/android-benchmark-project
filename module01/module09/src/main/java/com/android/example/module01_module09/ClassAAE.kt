package com.android.example.module01_module09

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module121_module3.ClassAAC = com.android.example.module06_module121_module3.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module121_module3.ClassAAD = com.android.example.module06_module121_module3.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module121_module3.ClassAAH = com.android.example.module06_module121_module3.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module121_module3.ClassAAI,
		param1: com.android.example.module06_module121_module3.ClassAAF,
		param2: com.android.example.module06_module121_module3.ClassAAI
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertNotSubscribed()

			}
		}
		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module121_module3.ClassAAH,
		param1: com.android.example.module06_module121_module3.ClassAAI,
		param2: com.android.example.module06_module121_module3.ClassAAE,
		param3: com.android.example.module06_module121_module3.ClassAAC
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertSubscribed()

		val local_var_2_6: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_6.dispose()

	}
}
